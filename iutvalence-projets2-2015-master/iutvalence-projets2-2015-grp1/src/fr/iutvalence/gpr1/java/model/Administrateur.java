package fr.iutvalence.gpr1.java.model;

/** Classe Administrateur. */
public class Administrateur extends Personne {

	/**
	 * Cr�ation d'un Administrateur.
	 * 
	 */	
	public Administrateur(String nom, String prenom, String login,
			String password) {
		super(nom, prenom, login, password);
	}

	
	/**
	 * Retourne les propri�t�es de l'Administrateur.
	 */
	public String toString(){
		return this.nom+", "+this.prenom+", "+this.login+", "+this.password+" /";
	}
}
