package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button submitButton;
    @FXML
    private RadioButton sithRadioButton;
    @FXML
    private RadioButton jediRadioButton;
    @FXML
    private RadioButton otherRadioButton;
    @FXML
    private TextField name;
    @FXML
    private TextArea extra;
    @FXML
    private Spinner offensive;
    @FXML
    private Spinner defensive;
    @FXML
    private Spinner health;
    @FXML
    private Spinner forceSkill;
    @FXML
    private ImageView starWarsLogo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
