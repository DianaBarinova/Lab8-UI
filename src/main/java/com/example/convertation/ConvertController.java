package com.example.convertation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ConvertController {

    @FXML
    private Button Shestn;

    @FXML
    private TextField Enternumber;

    @FXML
    private Button dvoich;

    @FXML
    private TextField resShestn;

    @FXML
    private TextField resDvoich;

    @FXML
    private TextField resVosmirich;

    @FXML
    private Button vosmirich;

    @FXML
    void convertShestn(ActionEvent event) {

            int number = Integer.parseInt(Enternumber.getText());
        resShestn.setText(Integer.toHexString(number).toUpperCase());
    }

    @FXML
    void convertDvoich(ActionEvent event) {
        int number = Integer.parseInt(Enternumber.getText());
        resDvoich.setText(Integer.toBinaryString(number));
    }

    @FXML
    void convertVocmirich(ActionEvent event) {
        int number = Integer.parseInt(Enternumber.getText());

        resVosmirich.setText(Integer.toOctalString(number));
    }

}
