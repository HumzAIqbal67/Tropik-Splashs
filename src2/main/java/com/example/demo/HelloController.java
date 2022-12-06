package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button killyURSELF;

    @FXML
    void btnOkClicked(ActionEvent event) {
        System.out.println("kill yourself");

    }

}