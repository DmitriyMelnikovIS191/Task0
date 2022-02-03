package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Procent;

public class HelloController {

    Procent Precent = new Procent();
    @FXML
    private TextField TXsumm;
    @FXML
    private Label lb1;
    @FXML
    private Label lb2;
    @FXML
    private Label lb3;
    @FXML
    private Label lb4;

    @FXML
    protected void verygoodClick() {
        lb2.setText("Заплати:"+String.valueOf(Precent.countSumTrunc(Double.parseDouble(TXsumm.getText()), 15))+" рублей");
    }

    @FXML
    protected void goodClick() {
        lb3.setText("Заплати:"+String.valueOf(Precent.countSumTrunc(Double.parseDouble(TXsumm.getText()), 10))+" рублей");
    }

    @FXML
    protected void plohoClick() {
        lb4.setText("Заплати:"+String.valueOf(Precent.countSumTrunc(Double.parseDouble(TXsumm.getText()), 3))+" рублей");
    }


}