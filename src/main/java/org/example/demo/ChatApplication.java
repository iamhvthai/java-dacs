package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ChatApplication extends Application {
    private Stage stage;
    public Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            Scene scene = new Scene(root, 900, 600);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        this.stage = primaryStage;
//        FXMLLoader fxmlLoader = new FXMLLoader(ChatApplication.class.getResource("hello-view.fxml"));
//        stage.setTitle("Hello!");
//        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
////        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
//        LoginController controller = fxmlLoader.getController();
//        controller.setStage(stage);
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}