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
	public void yellowBackgroundColor(MouseEvent event) {
		backgroundPane.setStyle("-fx-background-color:#ffef3d");
        System.out.println("New background color: yellow");
	}

	@FXML
	public void blueBackgroundColor(MouseEvent event) {
		backgroundPane.setStyle("-fx-background-color:#3074e3");  
        System.out.println("New background color: blue");
	}

	@FXML
	public void redBackgroundColor(MouseEvent event) {
		backgroundPane.setStyle("-fx-background-color:#fa1616");  
        System.out.println("New background color: red");
	}
}
