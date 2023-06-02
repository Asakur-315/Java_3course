package com.hotel;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class SecondaryController {
    
    @FXML
    private TableView roomTable;
    @FXML
    private Button buttonClearServicesList;
    @FXML
    private Button buttonGoMain;
    @FXML
    private Button buttonCreate;
    @FXML
    private TextField room;
    @FXML
    private DatePicker inDate;
    @FXML
    private DatePicker leaveDate;
    @FXML
    private ComboBox services;
    @FXML
    private TextArea servicesList;
    @FXML
    private Label cost;
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private float countCost(){
        return 0;
    }
}