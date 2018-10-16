/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author sebastian-andreas.si
 */
public class SuperloginController implements Initializable {

    @FXML
    private TextField pw;

    @FXML
    private TextField name;


    ContexteIdentification contexte;
    
    @FXML
    private Button b;

    @FXML
    private void actionOK(ActionEvent event) {
        System.out.println("Le Login est " + contexte.getLoginUtilisateurCOnnecte()
                + " et le mot de passe est " + contexte.getPasswordUtilisateurConnecte());

        Personne p = contexte.identification();
        if (p != null) {
            try {
                Stage stage = (Stage) this.name.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Tp1.class.getResource("MainWindow.fxml"));
                BorderPane rootLayout = (BorderPane) loader.load();

                MainWindowController controller = loader.getController();
                ContexteAvatar contexteAvatar = new ContexteAvatar(p);
                controller.setContexte(contexteAvatar);

                Scene scene = new Scene(rootLayout, 1000, 600);

                stage.setScene(scene);
                stage.centerOnScreen();
            } catch (IOException e) {
                //Logger.getLogger(SuperloginController.class.getName()).log(Level.SEVERE, null,e);
            }
        }
    }

    @FXML
    private void ProcessCancel(ActionEvent event) {
        name.setText("");
        pw.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.setText("admin");
        pw.setText("admin");
        name.requestFocus();
    }

    public void setContexte(ContexteIdentification contexte) {
        this.contexte = contexte;
        contexte.loginUtilisateurCOnnecteProperty().bind(name.textProperty());
        contexte.passwordUtilisateurConnecteProperty().bind(pw.textProperty());
    }

    @FXML
    private void checkname(MouseEvent event) {
        if (name.textProperty().getValue().equals("")) {
            b.setStyle("-fx-background-color: red");
        }
    }
}
