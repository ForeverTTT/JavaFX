package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class SafetyInstroVideo extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        String url = "file:///D:/TUM/22SS/EIST/Team%20project/JavaFX/src/main/resources/com/example/javafx/SafetyIV/SafetyInstructionVideo.mp4";
        //String url="http://pyw6ax.natappfree.cc/qwq.mp4";
        Media media = new Media(url);
        MediaPlayer mplayer = new MediaPlayer(media);
        MediaView mView = new MediaView(mplayer);
        System.out.println(media.getSource());

        Pane pane = new Pane();
        pane.getChildren().add(mView);
        mView.fitHeightProperty().bind(pane.heightProperty());
        mView.fitWidthProperty().bind(pane.widthProperty());

        Scene scene = new Scene(pane,1000,560);
        primaryStage.setTitle("MediaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

        mplayer.play();
    }
}
