package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.layout.AnchorPane;

import javafx.scene.input.MouseEvent;

public class PrincipalController {
	@FXML
	private AnchorPane backgroundPane;
	@FXML
	private Button yellowButton;
	@FXML
	private Button blueButton;
	@FXML
	private Button redButton;


	@FXML
	public String BackgroundColorYellow(MouseEvent event) {
		backgroundPane.setStyle("-fx-background-color:#ffef3d");
        return "Yellow";
	}

	@FXML
	public String BackgroundColorBlue(MouseEvent event) {
		backgroundPane.setStyle("-fx-background-color:#3074e3"); 
        return "Blue";
	}

	@FXML
	public String BackgroundColorRed(MouseEvent event) {
		backgroundPane.setStyle("-fx-background-color:#fa1616");  
        return "Red";
	}
}
