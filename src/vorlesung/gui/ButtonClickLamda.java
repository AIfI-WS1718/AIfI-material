package vorlesung.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonClickLamda extends Application {

	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Halloooooo");

		button = new Button("Klick mich");
		button.setOnAction(e -> {
			if (e.getSource() == button) {
				System.out.println("Klick...");
			}
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 200);
		primaryStage.setScene(scene);

		primaryStage.show();
	}
}
