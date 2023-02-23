
package com.example.exercise1;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lable;
    int number = 0;

    @FXML
    void DecreaseOnAction(ActionEvent event) {
        number = number - 1;
        String s1 = Integer.toString(number);
        lable.setText(s1);
    }

    @FXML
    void IncreaseOnAction(ActionEvent event) {
        number = number + 1;
        String s1 = Integer.toString(number);
        lable.setText(s1);
    }

}

