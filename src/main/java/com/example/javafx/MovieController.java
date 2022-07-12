package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MovieController {
    @FXML
    private Button movie1;

    @FXML
    private Button movie2;

    @FXML
    private Button movie3;

    @FXML
    private Button movie4;

    @FXML
    private Button movie5;

    @FXML
    private Button movie6;

    @FXML
    private Button movie7;

    @FXML
    private Button movie8;

    @FXML
    private Button toMainPage;

    void movieshow(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Moviedisplay.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage=new Stage();
        newStage.setTitle("MovieDisplay");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void movie1show(ActionEvent event) throws IOException {
        movieshow(event);
    }

    @FXML
    void movie2show(ActionEvent event) throws IOException {
        movieshow(event);
    }

    @FXML
    void movie3show(ActionEvent event) throws IOException {
        movieshow(event);
    }

    @FXML
    void movie4show(ActionEvent event) throws IOException {
        movieshow(event);
    }

    @FXML
    void movie5show(ActionEvent event) throws IOException {
        movieshow(event);
    }

    @FXML
    void movie6show(ActionEvent event) throws IOException {
        movieshow(event);
    }

    @FXML
    void movie7show(ActionEvent event) throws IOException {
        movieshow(event);
    }

    @FXML
    void movie8show(ActionEvent event) throws IOException {
        movieshow(event);
    }

    @FXML
    void toMainPageClick(ActionEvent event) {
        Stage stage = (Stage)toMainPage.getScene().getWindow();
        stage.close();
    }

}

