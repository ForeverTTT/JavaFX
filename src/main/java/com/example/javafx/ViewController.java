package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class ViewController {
    @FXML
    private Button entertainment;

    @FXML
    private StackPane mainPane;

    @FXML
    private Button safetyButton;

    @FXML
    private Button searchButton;

    @FXML
    private Button settingButton;

//    public void initialize() {
//        try {
//            URL welcomeUrl = getClass().getResource("welcomebild.fxml");
//            welcomeBild = getParent(welcomeUrl);
////            URL entertainUrl = getClass().getResource("entertainsys.fxml");
////            entertainSys = getParent(entertainUrl);
//
//            mainPane.getChildren().addAll(welcomeBild);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private Parent getParent(URL url) throws IOException {
        FXMLLoader loader = new FXMLLoader(url);
        return loader.load();
    }

    @FXML
    void entertainClick(ActionEvent event) throws IOException {
//        URL welcomeUrl = getClass().getResource("welcomebild.fxml");
//        welcomeBild = getParent(welcomeUrl);
//        welcomeBild.toFront();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("entertainsys.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage=new Stage();
        newStage.setTitle("entertain");
        newStage.setScene(scene);
        newStage.show();
    }


    @FXML
    void safetyClick(ActionEvent event) throws IOException {
        Button button= (Button) event.getSource();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("safetyinstruction.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage=new Stage();
        newStage.setTitle("Safety Instruction");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    void settingClick(ActionEvent event) {
        Button button= (Button) event.getSource();
        Stage newStage=new Stage();
        newStage.setTitle("Settings");
        newStage.show();
    }

    @FXML
    void searchClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)searchButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("showflightinfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage=new Stage();
        newStage.setTitle("welcome");
        newStage.setScene(scene);
        newStage.show();
        stage.close();
    }
}
