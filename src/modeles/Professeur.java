package modeles;

public class Professeur extends Utilisateur
{

	public Professeur (String unNom,String unPrenom,String unEmail,String unPassword)
	{
		super.setNom(unNom);
		super.setPrenom(unPrenom);
		super.setEmail(unEmail);
		super.setPassword(unPassword);
		
	}

	
	public String toString() 
	{
		return "je suis un professeur et je m'appelle "+super.getFullName();
	}
}
