package vorlesung.gui.graphik1fx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestScreen3 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private int counter=0;

	@Override
	public void start(Stage stage) throws Exception {
		VBox vBox = new VBox();
		final Label label = new Label(getText());

		Button button1 = new Button("Knopf 1");
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				counter++;
				label.setText(getText());
			}
		});

		// Dieser Knopf simuliert den Start eines langlaufenden Prozesses,
		// der Zwischenergebnisse produziert.
		// Die naive Version (auskommentiert) funktioniert nicht (ausprobieren!),
		// weil Änderungen an GUI-Elementen erst nach Rückkehr aus dem EventHandler
		// sichtbar werden, und dieser im Übrigen gar nicht blockieren darf -
		// EventHandler dürfen nichts anderes machen, als direkt die GUI updaten und dann zurückkehren.
		// Deswegen wird in der korrekten Version ein Task gestartet, der dann im Hintergrund läuft.
		// Der wiederum muss dann das Aktualisieren des Labels in ein Platform.runLater einwickeln.
		// Dadurch wird es als "Auftrag" an das GUI-Framework geschickt, was es dann im richtigen Moment ausführt.
		Button button2 = new Button("Knopf 2");
//		button2.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				for (int i=0; i<10; i++) {
//					counter = counter + 1;
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException ex) {
//						throw new RuntimeException(ex);
//					}
//					label.setText(getText());
//				}
//			}
//		});
		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Task<Integer> myTask = new Task<Integer>() {
					@Override
					protected Integer call() throws Exception {
						for (int i=0; i<10; i++) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ex) {
								throw new RuntimeException(ex);
							}
							counter = counter + 1;
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									label.setText(getText());
								}
							});
						}
						return counter;
					}
				};
				new Thread(myTask).start();
			}
		});
		vBox.getChildren().addAll(button1, button2);


		BorderPane parent = new BorderPane();
		parent.setCenter(vBox);
		parent.setBottom(label);
		stage.setScene(new Scene(parent, 800, 600));
		stage.show();
	}

	private String getText() {
		return "Count: "+counter;
	}

}
