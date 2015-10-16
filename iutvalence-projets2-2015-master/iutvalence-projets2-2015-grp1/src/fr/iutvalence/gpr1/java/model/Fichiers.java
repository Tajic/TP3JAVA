package fr.iutvalence.gpr1.java.model;

public class Fichiers {

	protected File fichierEtudiants;
	protected File fichierProfesseurs;
	protected File fichierAdministrateurs;

	public Fichiers(File fileEtudiants, File fileProfesseurs, File fileAdministrateurs) {
	
		this.fichierEtudiants = fileEtudiants;
		this.fichierProfesseurs = fileProfesseurs;
		this.fichierAdministrateurs = fileAdministrateurs;
		
	}
	
	/*
	 * Retourne le fichier étudiants
	 * 
	 */
	public Fichiers getEtudiants()
	{
		return this.fichierEtudiants;
	}

	/*
	 * Retourne le fichier Professeurs
	 * 
	 */

	public Fichiers getProfesseurs()
	{
		return this.fichierProfesseurs;
	}
	
	/*
	 * Retourne le fichier Administrateurs
	 * 
	 */

	public Fichiers getAdministrateurs()
	{
		return this.fichierAdministrateurs;
	}

}
