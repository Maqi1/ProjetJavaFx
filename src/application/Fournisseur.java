package application;

import javafx.scene.control.TextField;

public class Fournisseur {

	private String Nom;
	private String Adresse;
	private String telephone;
	private String Email;

	@Override
	public String toString() {
		return "Fournisseur [Nom=" + Nom + ", Adresse=" + Adresse + ", telephone=" + telephone + ", Email=" + Email
				+ "]";
	}

	public Fournisseur(String nom, String adresse, String telephone, String email) {
		
		Nom = nom;
		Adresse = adresse;
		this.telephone = telephone;
		Email = email;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	

}
