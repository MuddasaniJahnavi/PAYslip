package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Pane menuPane;
    @FXML
    public GridPane rootGridPane;
    @FXML
    public Pane displayPane;
    @FXML
    public Button showbtn;
    @FXML
    public Button pdfbtn;
    @FXML
    public TextField textF = new TextField();

    @FXML
    public void resetT() {
        textF.clear();
        System.out.println("check");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
