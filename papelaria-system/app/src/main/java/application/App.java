package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        Scene scn = new Scene(
            new Label("Sistema Papelaria"),
            700,
            500
        );

        stage.setScene(scn);
        stage.setTitle("Papelaria");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}