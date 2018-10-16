/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import com.sun.javafx.geom.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author sebastian-andreas.si
 */
public class MainWindowController implements Initializable {

    ContexteAvatar contexte;
    @FXML
    private ComboBox<String> cmbb_haircolor;
    @FXML
    private ComboBox<String> cmbb_eyeColor;
    @FXML
    private Slider sl_hairLength;
    @FXML
    private Button btn_reset;
    @FXML
    private Button btn_save;
    @FXML
    private ListView<String> lsb_details;
    @FXML
    private Canvas canvasID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> eyeColor = FXCollections.observableArrayList("noir", "marron", "vert", "bleu");
        cmbb_eyeColor.setItems(eyeColor);

        ObservableList<String> hairColor = FXCollections.observableArrayList("noir", "marron", "blond");
        cmbb_haircolor.setItems(hairColor);

        sl_hairLength.setMin(0);
        sl_hairLength.setMax(100);
        sl_hairLength.setValue(40);
        sl_hairLength.setShowTickLabels(true);
        sl_hairLength.setShowTickMarks(true);
        sl_hairLength.setMajorTickUnit(50);
        sl_hairLength.setMinorTickCount(5);
        sl_hairLength.setBlockIncrement(10);
        
        GraphicsContext gc = canvasID.getGraphicsContext2D();
        gc.fillRect(100, 100, 100, 100);
        gc.setFill(Color.RED);
        gc.fillOval(110, 120, 20, 20);
        gc.fillOval(170, 120, 20, 20);
        gc.fillRoundRect(110, 180, 80, 4, 0, 0);
        

    }

    public void setContexte(ContexteAvatar contexte) {
        this.contexte = contexte;
        //contexte.getEye_color().bind(cmbb_eyeColor.valueProperty());
        //contexte.getHair_color().bind(cmbb_haircolor.valueProperty());
        //contexte.getHair_lenght().bind(sl_hairLength.valueProperty());
        //contexte.getEye_color().bind(cmbb_eyeColor.valueProperty());
        this.contexte = contexte;
        contexte.getPersonne().getEyeColorProperty().bind(cmbb_eyeColor.valueProperty());
        contexte.getPersonne().getEyeColorProperty().addListener((ob, o, n) -> {
            System.out.println("test");
            redraw();
  });
        //contexte.loginUtilisateurCOnnecteProperty().bind(name.textProperty());
        //contexte.passwordUtilisateurConnecteProperty().bind(pw.textProperty());
        
    }
    public void redraw(){
        
        GraphicsContext gc = canvasID.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.clearRect(0, 0, 500, 500);
        gc.setFill(Color.BLACK);
        gc.fillRect(100, 100, 100, 100);
        String col = contexte.getPersonne().getEyeColor();
        System.out.println(col);
        
        switch(col){
            case "marron": gc.setFill(Color.BROWN);
            break;
            case "vert": gc.setFill(Color.GREEN);
            break;
            case "noir": gc.setFill(Color.BLACK);
            break;
            default: gc.setFill(Color.WHITE);
        }
        gc.fillOval(110, 120, 20, 20);
        gc.fillOval(170, 120, 20, 20);
        gc.setFill(Color.WHITE);
        gc.fillRoundRect(110, 180, 80, 4, 0, 0); 
    }

    @FXML
    private void reset(ActionEvent event) {
        cmbb_eyeColor.setValue("");
        cmbb_haircolor.setValue("");
        sl_hairLength.setValue(0);
    }

    @FXML
    private void save(ActionEvent event) {
    }
}
