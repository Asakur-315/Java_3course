package com.hotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Главный класс JavaFX части приложения
 * Инициирует запуск приложения
 * @author	Дмитриев В.Э.
 * @version	1.0
 */
public class App extends Application {
    /** Объект сцены */
    private static Scene scene;

    /** 
     * Метод, действующий как конструктор
     * @param stage - объект класса Stage, наследованный от Window
     * Использует переопределйнный метод загрузки fxml
     * @see App#loadFXML(String)
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 800, 400);
        stage.setScene(scene);
        stage.setTitle("Booking service");
        stage.show();
    }
    /**
    * Назначает root-путь к fxml файлу
    * @param fxml - путь к файлу 
    */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /** 
    * Загружает fxml файл 
    * @param fxml - путь к файлу 
    * @return результат загрузки fxml файла
    */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
    * Инициирует программу 
    */
    public static void main(String[] args) {
        launch();
    }

}