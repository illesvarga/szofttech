package hu.unideb.inf;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    Label label;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void test()
    {
        System.out.println("Hello world!!!");
        label.setText("Hello");
    }

}
