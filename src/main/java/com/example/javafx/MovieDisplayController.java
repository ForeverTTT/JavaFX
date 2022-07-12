package com.example.javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.util.Duration;

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

    private final Duration duration=new Media("file:///D:/TUM/22SS/EIST/Team%20project/JavaFX/src/main/resources/com/example/javafx/SafetyIV/1.mp4").getDuration();

    @FXML
    void back(ActionEvent event) {
        if(mediaPlayer.getCurrentTime().compareTo(Duration.seconds(5))<0){
            mediaPlayer.seek(mediaPlayer.getStartTime());
        }else{
            mediaPlayer.seek(mediaPlayer.getCurrentTime().subtract(Duration.seconds(5)));
        }
        videoScrollBar.setValue(mediaPlayer.getCurrentTime().toMillis()/duration.toMillis() * 100);
        mediaPlayer.play();
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
        if(mediaPlayer.getStopTime().subtract(mediaPlayer.getCurrentTime()).compareTo(Duration.seconds(5))<0){
            mediaPlayer.seek(mediaPlayer.getStopTime());
        }else{
            mediaPlayer.seek(mediaPlayer.getCurrentTime().add(Duration.seconds(5)));
        }
        videoScrollBar.setValue(mediaPlayer.getCurrentTime().toMillis()/duration.toMillis() * 100);
        mediaPlayer.play();
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

    @FXML
    void moveSlider(){
        videoScrollBar.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if(videoScrollBar.isValueChanging()){
                    mediaPlayer.seek(duration.multiply(videoScrollBar.getValue()/100.0));
                }
            }
        });
        Duration currentTime=mediaPlayer.getCurrentTime();
        if(!videoScrollBar.isDisabled() && duration.greaterThan(Duration.ZERO) && !videoScrollBar.isValueChanging()){
            videoScrollBar.setValue(currentTime.toMillis()/duration.toMillis() * 100);
        }
        mediaPlayer.play();
    }
}

