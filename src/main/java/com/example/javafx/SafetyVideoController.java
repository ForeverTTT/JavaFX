package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class SafetyVideoController {

    private MediaPlayer mediaPlayer;
    @FXML
    private MediaView playMedia;

    @FXML
    private AnchorPane VideoPane;

    @FXML
    private Button back;

    @FXML
    private Button front;

    @FXML
    private Button startVideo;

    @FXML
    private Button stopVideo;

    @FXML
    private Slider videoScrollBar;

    @FXML
    void back(ActionEvent event) {

    }

    @FXML
    void front(ActionEvent event) {

    }

    @FXML
    void startVideo(ActionEvent event) {
        String url = "file:///D:/TUM/22SS/EIST/Team%20project/JavaFX/src/main/resources/com/example/javafx/SafetyIV/SafetyInstructionVideo.mp4";
       // String url="https://v6.bdxiguavod.com/f15ed003509bbd59763caa852147e620/629b38e8/video/tos/cn/tos-cn-v-3506/c315b7bb2614451187a2b0f22e2d5fd4/";
        Media media = new Media(url);
        mediaPlayer = new MediaPlayer(media);
        playMedia = new MediaView(mediaPlayer);

        VideoPane.getChildren().add(playMedia);
        playMedia.fitHeightProperty().bind(VideoPane.heightProperty());
        playMedia.fitWidthProperty().bind(VideoPane.widthProperty());

        mediaPlayer.play();
    }

    @FXML
    void stopVideo(ActionEvent event) {
        mediaPlayer.stop();
    }

}