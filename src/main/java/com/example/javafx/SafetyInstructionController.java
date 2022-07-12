package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SafetyInstructionController {
    @FXML
    private Button watchVideo;

    @FXML
    void watchSafetyVideo(ActionEvent event) throws IOException {
        Button button= (Button) event.getSource();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Safety Instruction Video.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage=new Stage();
        newStage.setTitle("Safety Instruction");
        newStage.setScene(scene);
        newStage.show();
    }
}
