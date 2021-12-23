package ca.est.controller;
import java.io.IOException;

import org.springframework.stereotype.Component;

import ca.est.Main;
import javafx.fxml.FXML;

/**
 * 
 * @author Estevam
 *
 *  MainWindowController is used by MainWindow.fxml
 */
@Component
public class MainWindowController {
    @FXML
    private void switchToSecondary() throws IOException {
    	Main.setRoot("secondary");
    }
}
