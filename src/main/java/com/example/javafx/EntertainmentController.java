package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class EntertainmentController {

    @FXML
    private Button menuButton;

    @FXML
    private Button movieButton;

    @FXML
    private Button musicButton;

    @FXML
    private Button ratingButton;

    @FXML
    private Button toMainPage;

    @FXML
    void moviesClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("movie.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage=new Stage();
        newStage.setTitle("Rating");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void ratingClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ratingView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage=new Stage();
        newStage.setTitle("Rating");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void toMainPageClick(ActionEvent event) {
        Stage stage = (Stage)toMainPage.getScene().getWindow();
        stage.close();
    }

}
