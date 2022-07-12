package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class RatingViewController {

    @FXML
    private ScrollBar cateringRate;

    @FXML
    private ScrollBar comfortRate;

    @FXML
    private Button commitRatingButton;

    @FXML
    private ScrollBar entertainRate;

    @FXML
    private ScrollBar impressionRate;

    @FXML
    void commitRating(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("awardView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage=new Stage();
        newStage.setTitle("Award");
        newStage.setScene(scene);
        newStage.show();
        Stage stage = (Stage)commitRatingButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void showcateringRate(MouseEvent event) {

    }

    @FXML
    void showcomfortRate(MouseEvent event) {

    }

    @FXML
    void showentertainRate(MouseEvent event) {

    }

    @FXML
    void showimpressionRate(MouseEvent event) {

    }

}
