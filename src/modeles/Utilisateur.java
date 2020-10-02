package modeles;

public abstract class Utilisateur
{
	private int id_utilisateur;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	
	
	public int getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(int id_utilisateur)
	{
		this.id_utilisateur = id_utilisateur;
	}
	public String getNom()
	{
		return this.nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return this.password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getFullName()
	{
		return this.getNom()+" "+this.getPrenom();
	}
	
	public String toString()
	{
		return "mon utilisateur n� "+ this.getId_utilisateur()
									+" je m'appelle " +this.getFullName();
	
		
	}
	

}
