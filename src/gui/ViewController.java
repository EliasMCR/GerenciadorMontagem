package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private Button tbutton;

	@FXML
	private TextField txtcampo1;

	@FXML
	private TextField txtcampo2;

	@FXML
	private Label label;

	@FXML
	public void onButtonAction() {
		Double num1 = Double.parseDouble(txtcampo1.getText());
		Double num2 = Double.parseDouble(txtcampo2.getText());
		Double sum = num1 + num2;
		label.setText(sum.toString());
	}
}
