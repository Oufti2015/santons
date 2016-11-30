package sst.santons;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sst.santons.view.ListViewController;

public class Santons extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {

	this.primaryStage = primaryStage;
	this.primaryStage.setTitle("Santons");

	initRootLayout();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
	try {
	    // Load root layout from fxml file.
	    FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(Santons.class.getResource("view/ListView.fxml"));
	    rootLayout = (BorderPane) loader.load();

	    ListViewController controller = loader.getController();
	    controller.setOwner(this);

	    // Show the scene containing the root layout.
	    Scene scene = new Scene(rootLayout);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void main(String[] args) {
	launch(args);
    }

    public Stage getPrimaryStage() {
	return primaryStage;
    }

    public BorderPane getRootLayout() {
	return rootLayout;
    }
}
