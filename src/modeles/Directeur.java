package modeles;

public class Directeur extends Utilisateur
{
	private char sexe;
	
	public Directeur (String unNom,String unPrenom,String unEmail,String unPassword,char unSexe)
	{
		super.setNom(unNom);
		super.setPrenom(unPrenom);
		super.setEmail(unEmail);
		super.setPassword(unPassword);
		this.sexe = unSexe;
		
	}

	
	public String toString() 
	{
		String identite = (this.sexe == 'M' || this.sexe == 'm' )?" le directeur":" la directrice";
		return "je suis"+ identite +" et je m'appelle "+super.getFullName();
	}

}
