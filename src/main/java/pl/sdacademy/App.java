package pl.sdacademy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        VBox vBox = new VBox();
        TextField textField = new TextField("Pole tekstowe");
        Label label = new Label("Etykieta");
        Button button = new Button("Przycisk");
        CheckBox checkBox = new CheckBox("Po;e zaznaczenia");
        vBox.getChildren().addAll(
               textField,
               label,
               button,
               checkBox
        );
        button.setOnAction(actionEvent -> {
            System.out.println("Przycisk został kliknięty");
            label.setText("Wartość w polu tekstowym: " + textField.getText()
            + ", czy checkbox jest zaznaczony: " + checkBox.isSelected());
        });
        Scene scene = new Scene(vBox, 500, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}