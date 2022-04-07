package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ListFournisseurControlleur implements Initializable {
	
	@FXML
	 private TableView<Fournisseur> tableFournisseurs;

	
    @FXML
    private TableColumn<Fournisseur, String> Nom;

    @FXML
    private TableColumn<Fournisseur, String> Adresse;

    @FXML
    private TableColumn<Fournisseur, String> Telephone;

    @FXML
    private TableColumn<Fournisseur, String> Email;
    

    @FXML
    private Label Listfournisseurs;
    
	@FXML
	public void handlebtnAddAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) Listfournisseurs.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("Fournisseur.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,380,500);

		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Nom.setCellValueFactory(new PropertyValueFactory<Fournisseur, String>("Nom"));
		Adresse.setCellValueFactory(new PropertyValueFactory<Fournisseur, String>("Adresse"));
		Telephone.setCellValueFactory(new PropertyValueFactory<Fournisseur, String>("Telephone"));
		Email.setCellValueFactory(new PropertyValueFactory<Fournisseur, String>("Email"));

		//ObservableList<Produit> produits = getProductsList();
//		tableProducts.setItems(List);
		

	
		//ObservableList<Produit> produits = getProductsList();
		tableFournisseurs.setItems(Main.listF);
		
		

		
	}

		
	}


