package sio.devoir1sioalt;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.ResourceBundle;

public class DevoirController implements Initializable {

    @FXML
    private Button btnExo1;
    @FXML
    private AnchorPane apExo1;
    @FXML
    private AnchorPane apExo2;
    @FXML
    private AnchorPane apExo3;
    @FXML
    private Button btnExo2;
    @FXML
    private Slider sldNbLignes;
    @FXML
    private TextArea txtTriangle;
    @FXML
    private Button btnExo3;
    @FXML
    private Button btnDessiner;
    @FXML
    private TextField txtNbJours;
    @FXML
    private TextField txtNbEleves;
    @FXML
    private TextField txtCoutGlobal;
    @FXML
    private Button btnCalculer;
    @FXML
    private Button btnJouer;
    @FXML
    private TextArea txtResultatsTirages;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        apExo1.toFront();
    }

    @FXML
    public void btnExosMenuClicked(Event event)
    {
        if(event.getSource() == btnExo1)
        {
            apExo1.toFront();
        }
        else if(event.getSource() == btnExo2)
        {
            apExo2.toFront();
        }
        else
        {
            apExo3.toFront();;
        }
    }

    // Exercice n°1
    @FXML
    public void btnCalculerClicked(Event event)
    {
        if(txtNbJours.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("choix du nombre de jours");
            alert.setHeaderText("");
            alert.setContentText("Veuillez saisir le nombre de jours");
            alert.showAndWait();
        }
        else if(txtNbEleves.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choix du nombre d'eleves");
            alert.setHeaderText("");
            alert.setContentText("Veuillez saisir le nombre d'eleves");
            alert.showAndWait();
        }

        else
        {
            int nombreJours = Integer.parseInt(txtNbJours.getText());
            int nombreEleve = Integer.parseInt(txtNbEleves.getText());
            int coûtGlobal = Integer.parseInt(txtCoutGlobal.getValue().toString());

            if( nombreEleve <= 1)
            {
                cout trajet =montantReel * 67,30;
            }
            else if(nombreEleve<= 26)
            {
                cout trajet = montantReel * 61;
            }
            else if(coutnourriture <= 1)
            {
                coutnourriture = montantReel * 3,50;
            }
            if(nombreEleve >= 31)
            {
                hebergement = montantReel * 4,75;
            }
            if(nombreEleve>= 35)
            {
                hebergement = montantReel * 3,50 ;
            }
            txtCoutGlobal.setText("Cout global : "+df.format(txtCoutGlobal) + " €");
        }
    }

    // Exercice n°2
    @FXML
    public void btnDessinerClicked(Event event)
    {
        txtTriangle.setText("");

        for(int i = 1 ; i <= sldTriangle.getValue() ; i++)
        {
            for(int k = 1 ; k <= i - 1 ; k++)
            {
                txtTriangle.setText(txtTriangle.getText() + "1");
            }
            for(int j = 1 ; j <= ((2 * sldTriangle.getValue()) - (2 * i - 1))  ; j++)
            {
                txtTriangle.setText(txtTriangle.getText() + "2");
            }

            txtTriangle.setText(txtTriangle.getText()+"\n");
        }
    }

    // Exercice n°3
    @FXML
    public void btnJouerClicked(Event event)
    {
        // A vous de jouer

    }
}