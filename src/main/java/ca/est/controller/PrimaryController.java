package ca.est.controller;

import java.io.IOException;

import ca.est.Main;
import javafx.fxml.FXML;

public class PrimaryController {

	@FXML
	private void switchToSecondary() throws IOException {
		Main.setRoot("secondary");
	}
}
