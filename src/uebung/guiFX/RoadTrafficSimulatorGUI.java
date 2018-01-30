package uebung.guiFX;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class RoadTrafficSimulatorGUI extends Application {
    
		
	
	
	
    @Override
    public void start(Stage primaryStage) {
    	RoadTrafficSimulator sim = new RoadTrafficSimulator();
    	
    	BorderPane root = new BorderPane();
    	
    	Pane simulationPane = new Pane();
        BackgroundImage map = new BackgroundImage(new Image("file:///C:/Users/jschu/git/AIfI-material/src/uebung/guiFX/Hintergrundkarte.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        simulationPane.setBackground(new Background(map));
       
        
        Map<Integer, Text> texts = new HashMap<>();
        Map<Integer, Line> links = new HashMap<>();
        
        for (Node node : sim.getNodes().values()) {
        	Circle circle = new Circle(node.getCoordinateX(), node.getCoordinateY(), 5);
        	simulationPane.getChildren().add(circle);
        }
        
        for (Link link : sim.getLinks().values()) {
        	Node startNode = link.getStartNode();
        	Node endNode = link.getEndNode();
        	Line line = new Line(startNode.getCoordinateX(), startNode.getCoordinateY(), endNode.getCoordinateX(), endNode.getCoordinateY());
        	links.put(link.getId(), line);
        	
        	if (link.getOccupation() < 0.5) {
        		line.setStroke(Color.GREEN);
        	} else if (link.getOccupation() < 1.0) {
        		line.setStroke(Color.YELLOW);
        	} else {
        		line.setStroke(Color.RED);
        	}
        	line.setStrokeWidth(link.getCapacity() / 500);
        	simulationPane.getChildren().add(line);
        	Text text = new Text(startNode.getCoordinateX(), startNode.getCoordinateY(), "Occupancy: "+link.getOccupation());
        	texts.put(link.getId(), text);
        	simulationPane.getChildren().add(text);
        }
    	
        Button button = new Button("Increase volume");
        button.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		sim.increaseTrafficVolume();
        		for (Link link : sim.getLinks().values()) {
        			Text text = texts.get(link.getId());
        			Line line = links.get(link.getId());
        			
        			if (link.getOccupation() < 0.5) {
                		line.setStroke(Color.GREEN);
                	} else if (link.getOccupation() < 1.0) {
                		line.setStroke(Color.YELLOW);
                	} else {
                		line.setStroke(Color.RED);
                	}
        			text.setText("Occupancy: "+link.getOccupation());
        		}
        	}
        });
        
        root.setTop(button);
        root.setCenter(simulationPane);
        

        Scene scene = new Scene(root, 1000, 450);

        primaryStage.setTitle("RoadTrafficSimulatorGUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}