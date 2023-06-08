package com.hotel;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
    /** Объект кнопки добавить бронь */
    @FXML
    private Button buttonAddBooking;
    /** Объект кнопки очистить список */
    @FXML
    private Button buttonRefresh;

    
    /**
     * Переключиться на второе окно
     * @throws IOException
     */
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void refreshTable() {}
}
