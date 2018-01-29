package vorlesung.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Threads extends Application {

	private static int counter;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Thread Beispiel");

		Label counterLabel = new Label();
		Button slowButton = new Button("Zähle langsam");
		Button fastButton = new Button("Zähle schnell");

		slowButton.setOnAction(e -> {
			for (int i=0; i<10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					throw new RuntimeException(ex);
				}
				counter++;
				counterLabel.setText("Count: " + counter);
			}
		});
		
		fastButton.setOnAction(e -> {
			// wir lagern die ganze Aktion in einen Task aus.
			Task<Integer> myTask = new Task<Integer>() {
				@Override
				protected Integer call() throws Exception {
					for (int i = 0; i < 10; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException ex) {
							throw new RuntimeException(ex);
						}
						counter++;
						// Das Aendern des Labels geben wir hier schon an Java weiter (und nicht erst nach Abschluss der kompletten handle-Methode)
						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								counterLabel.setText("Count: " + counter);
							}
						});
					}
					return counter;
				}
			};
			// Den Task starten wir parallel. D.h. waehrend die call-Methode arbeitet, kann die GUI schon weiterverwendet werden
			new Thread(myTask).start();
		});
		
		VBox layout = new VBox(20);
		layout.getChildren().addAll(counterLabel, slowButton, fastButton);
		Scene scene = new Scene(layout, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
