package Jumero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JumeroController {
	@FXML
	private TextField normaltext;
	@FXML
	private Button button;
	@FXML
	private CheckBox checkPreserve;
	@FXML
	private CheckBox checkStrict;
	@FXML
	private Label output;
	@FXML
	public void numeronise(ActionEvent event) {
		String inputText = normaltext.getText();
		String Output;
		if (checkPreserve.isSelected() && !checkStrict.isSelected()) {
			Output = (inputText.charAt(0) + String.valueOf(inputText.length()-2) + inputText.charAt(inputText.length()-1));
		}
		else if (checkStrict.isSelected() && !checkPreserve.isSelected()) {
			if (String.valueOf(inputText.length()-2).length() < 2)
				Output = (inputText.substring(0,1).toLowerCase() + String.valueOf(inputText.length()-4) + inputText.charAt(inputText.length()-3) + inputText.charAt(inputText.length()-1));
			else
				Output = (inputText.substring(0,1).toLowerCase() + String.valueOf(inputText.length()-2) + inputText.charAt(inputText.length()-1));
		}
		else if (checkStrict.isSelected() && checkPreserve.isSelected()) {
			if (String.valueOf(inputText.length()-2).length() < 2)
				Output = (inputText.charAt(0) + String.valueOf(inputText.length()-4) + inputText.charAt(inputText.length()-3) + inputText.charAt(inputText.length()-1));
			else
				Output = (inputText.charAt(0) + String.valueOf(inputText.length()-2) + inputText.charAt(inputText.length()-1));
		}
		else {
			Output = (inputText.substring(0,1).toLowerCase() + String.valueOf(inputText.length()-2) + inputText.charAt(inputText.length()-1));
		}
		output.setText(Output);
	}
}
