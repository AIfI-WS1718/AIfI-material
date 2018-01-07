package vorlesung.gui.graphik1fx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TestScreen35 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private int counter=0;

	@Override
	public void start(Stage stage) throws Exception {

		final Label label = new Label(getText());

		VBox vBox = new VBox();
		Button button1 = new Button("Knopf 1");
		Button button2 = new Button("Knopf 2");
		vBox.getChildren().addAll(button1, button2);

		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				counter++;
				label.setText(getText());
			}
		});

		// Wenn es *wirklich* nur darum geht, einen Zähler hochzuzählen (also den Effekt des
		// vorigen Beispiels zu haben, ohne dass es als Platzhalter für Hintergrund-Arbeit stehen soll),
		// dann wäre das vorige Beispiel unnötig umständlich:
		// Es gibt ein Konzept für zeitgesteuerte Aktionen namens Timeline. Damit sieht das Beispiel folgendermaßen
		// aus. Beachte, dass man hierbei komplett innerhalb des GUI-Frameworks bleibt - man muss nichts über Threads
		// oder dergleichen wissen.
		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						counter++;
						label.setText(getText());
					}
				});
				Timeline timeline = new Timeline(keyFrame);
				timeline.setCycleCount(10);
				timeline.play();
			}
		});


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
