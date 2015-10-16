package fr.iutvalence.gpr1.java.model;

/** Classe Date. */
public class Date {
	
	private int jour;
	private int mois;
	private int annee;

	/**
	 * Crée la date du cours courant
	 */
	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	/**
	 * Retourne le jour du cours courant
	 * 	 */
	public int getJour() {
		return jour;
	}

	/**
	 * Retourne le mois du cours courant
	 * 	 */
	public int getMois() {
		return mois;
	}

	/**
	 * Retourne l'année du cours courant
	 * */
	public int getAnnee() {
		return annee;
	}

}
