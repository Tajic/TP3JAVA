package fr.iutvalence.gpr1.java.model;

/** Classe Cours. */
public class Cours {

	private String typeCours;

	private String libelle;


	/**
	 * Crée le cours courant.
	 * 
	 */
	public Cours(String typeCours, String libelle) {
		this.typeCours = typeCours;
		this.libelle = libelle;
	}

	/**
	 * Retourne le type du cours courant.
	 *
	 */
	public String getTypeCours() {
		return typeCours;
	}

	/**
	 * Retourne le libelle du cours courant.
	 *
	 */
	public String getLibelle() {
		return libelle;
	}

}
