package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RatingAward {

    @FXML
    private Button close;

    @FXML
    void closeClick(ActionEvent event) {
        Stage stage = (Stage)close.getScene().getWindow();
        stage.close();
    }

}
