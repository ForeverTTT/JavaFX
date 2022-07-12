package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.media.Media;

public class MovieDisplayController {

    private MediaPlayer mediaPlayer;

    @FXML
    private Button back;

    @FXML
    private Button closeButton;

    @FXML
    private Button front;

    @FXML
    private MediaView mediaView;

    @FXML
    private Button menubutton;

    @FXML
    private Button startVideo;

    @FXML
    private Button stopVideo;

    @FXML
    private AnchorPane videoPane;

    @FXML
    private Slider videoScrollBar;

    @FXML
    void back(ActionEvent event) {

    }

    @FXML
    void closeDisplay(ActionEvent event) {
        try{
            mediaPlayer.stop();
        }catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void front(ActionEvent event) {

    }

    @FXML
    void openMenu(ActionEvent event) {

    }

    @FXML
    void startVideo(ActionEvent event) {
        String url = "file:///D:/TUM/22SS/EIST/Team%20project/JavaFX/src/main/resources/com/example/javafx/SafetyIV/1.mp4";
        // String url="https://v6.bdxiguavod.com/f15ed003509bbd59763caa852147e620/629b38e8/video/tos/cn/tos-cn-v-3506/c315b7bb2614451187a2b0f22e2d5fd4/";
        Media media = new Media(url);
        mediaPlayer = new MediaPlayer(media);
        mediaView = new MediaView(mediaPlayer);

        videoPane.getChildren().add(mediaView);
        mediaView.fitHeightProperty().bind(videoPane.heightProperty());
        mediaView.fitWidthProperty().bind(videoPane.widthProperty());

        mediaPlayer.play();
    }

    @FXML
    void stopVideo(ActionEvent event) {
        mediaPlayer.pause();
    }

}

