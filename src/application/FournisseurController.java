package application;

import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FournisseurController {
	
//	ArrayList<Fournisseur> fournisseur = new ArrayList<>();


	@FXML
    private TextField Nom;

    @FXML
    private TextField Adresse;

    @FXML
    private TextField Tel;

    @FXML
    private TextField Email;

    @FXML
    private Button btnadd;

    

    
    
    
    @FXML
    public void handlebtnAddAction(ActionEvent e) throws IOException
	{
		System.out.println(Nom.getText());
		Fournisseur f = new Fournisseur(Nom.getText(),Adresse.getText(),Tel.getText(),Email.getText());
		
			Main.listF.add(f);
			
			Stage primaryStage = (Stage) btnadd.getScene().getWindow();
			BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListFournisseur.fxml"));
			Scene sceneList = new Scene(layoutAddProduct,380,500);
			sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(sceneList);
			
		
//			Stage primaryStage = (Stage) btnadd.getScene().getWindow();
//			BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("GestionDeFournisseur.fxml"));
//			Scene sceneAdd = new Scene(layoutAddProduct,700,400);
//			primaryStage.setScene(sceneAdd);
			
			
			/// début partie alert
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Fournisseur ajouté");
			alert.setHeaderText(null);
			alert.setContentText("Félicitation, produit ajouté avec succès");

			alert.showAndWait();
			/// fin partie alert
		
			
			Nom.clear();
			Adresse.clear();
			Tel.clear();
			Email.clear();		
		
	}
	
		


//    @FXML
//	public void handlebtnAddAction(ActionEvent e) throws IOException
//	{
//		Stage primaryStage = (Stage) btnadd.getScene().getWindow();
//		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListFournisseur.fxml"));
//		Scene sceneList = new Scene(layoutAddProduct,380,500);
//		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		primaryStage.setScene(sceneList);
//		
//	}
	
}
