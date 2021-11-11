package javaFX;

import java.net.URL;
import java.util.ResourceBundle;

import DAOFactory.DAOFactory;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import objMetier.Client;
import objMetier.Periodicite;
import objMetier.Revue;

public class CtrlAbonnement implements Initializable{
	@FXML
    private ChoiceBox<Client> cbxClient;
	private ChoiceBox<Revue> cbxRevue;
	
	@Override
    public void initialize(URL location, ResourceBundle resources) {

        DAOFactory dao = DAOFactory.getDAOFactory(Persistance.ListeMemoire);
        DAOFactory dao2 = DAOFactory.getDAOFactory(Persistance.ListeMemoire);
        this.cbxClient.setItems(FXCollections.observableArrayList(dao.getClientDAO().findAll()));
        this.cbxRevue.setItems(FXCollections.observableArrayList(dao2.getRevueDAO().findAll()));
    }
}
