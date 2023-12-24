package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane Pane;
    public Button BtnCustomer;


    public void CustomerButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CustomerForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setResizable(true);
        stage.show();
        }


    }

