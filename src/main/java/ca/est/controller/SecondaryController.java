package ca.est.controller;

import java.io.IOException;

import ca.est.Main;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        Main.setRoot("primary");
    }
}