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
    /** Объект таблицы*/
    @FXML
    private TableView roomTable;
    /** Объект кнопки очистки */
    @FXML
    private Button buttonClearServicesList;
    /** Объект кнопки на главную */
    @FXML
    private Button buttonGoMain;
    /** Объект кнопки создать */
    @FXML
    private Button buttonCreate;
    /** Объект текстового поля номер комнаты */
    @FXML
    private TextField room;
    /** Объект DatePicker для выбора даты въезда */
    @FXML
    private DatePicker inDate;
    /** Объект DatePicker для выбора даты выезда*/
    @FXML
    private DatePicker leaveDate;
    /** Объект выпадающего списка с доп.услугами*/
    @FXML
    private ComboBox<String> services;
    /** Объект текстовой области для отображения выбранных сервисов*/
    @FXML
    private TextArea servicesList;
    /** Объект надписи для отображения стоимости*/
    @FXML
    private Label cost;
    
    /**
     * Переключиться на основное окно
     * @throws IOException
     */
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    
    /**
     * Вычииляет стоимость (по задумке) 
     * @return float
     */
    @FXML
    private float countCost(){
        return 0;
    }
}