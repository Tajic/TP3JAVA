package fr.iutvalence.gpr1.java.model;

/** Classe Etudiant. */
public class Etudiant extends Personne {

	public static final int NBR_ABSENCE_BY_DEFAULT = 0;

	private String gprTP;
	
	private int grpTd;

	private int numEtudiant;

	private boolean absence;

	private int nbrAbsence;

	/**
	 * Cr�e un �tudiant
	 * 
	 */
	public Etudiant(String nom, String prenom, String gprTP, int grpTD, int numEtudiant,
			String login, String password) {
		super(nom, prenom, login, password);
		this.gprTP = gprTP;
		this.grpTd = grpTD;
		this.numEtudiant = numEtudiant;
		this.absence = true;
		this.nbrAbsence = NBR_ABSENCE_BY_DEFAULT;
	}

	/**
	 * Retourne le groupe de TD de l'�tudiant
	 * 
	 */
	public int getGrpTd() {
		return grpTd;
	}

	/**
	 * Retourne le groupe de TP de l'�tudiant
	 */
	public String getgprTP() {
		return this.gprTP;
	}

	/**
	 * Retourne le groupe de num�ro de l'�tudiant
	 *  */
	public int getnumEtudiant() {
		return this.numEtudiant;
	}

	/**
	 * Retourne le nombre d'absence de l'�tudiant
	 *  */
	public int getNbrAbsence() {
		return this.nbrAbsence;
	}

	/**
	 * Dit si l'�tudiant a �t� absent au cours courant
	 * */
	public boolean getAbsence() {
		return this.absence;
	}

	/**
	 * D�finit l'�tudiant comme absent au cours courant
	 * 
	 */
	public void setAbsence(boolean absence) {
		this.absence = absence;
	}

	/**
	 * Ajoute une absence au nombre d'absence total de l'�tudiant.
	 */
	public void addAbsence() {
		this.nbrAbsence = this.nbrAbsence++;
	}
	
	/**
	 * Définition de la méthode toString d'un Etudiant.
	 */
	public String toString(){
		return this.nom+","+this.prenom+","+this.gprTP+","+this.numEtudiant+ "/";
	}

}
	