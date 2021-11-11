package javaFX;

import java.net.URL;
import java.util.ResourceBundle;

import DAOFactory.DAOFactory;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import objMetier.Periodicite;

public class CtrlRevue implements Initializable{
	@FXML
    private ChoiceBox<Periodicite> cbxPeriodicite;
	
	@Override
    public void initialize(URL location, ResourceBundle resources) {

        DAOFactory dao = DAOFactory.getDAOFactory(Persistance.ListeMemoire);
        this.cbxPeriodicite.setItems(FXCollections.observableArrayList(dao.getPeriodiciteDAO().findAll()));
    }
}
