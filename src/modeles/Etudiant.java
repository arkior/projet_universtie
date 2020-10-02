package modeles;

public class Etudiant extends Utilisateur 
{
	
	
	private int age;
	
	public Etudiant (String unNom,String unPrenom,String unEmail,String unPassword,int unAge)
	{
		super.setNom(unNom);
		super.setPrenom(unPrenom);
		super.setEmail(unEmail);
		super.setPassword(unPassword);
		this.age = unAge;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String toString() 
	{
		return "je suis un etudiant et je m'appelle "+super.getFullName();
	}

}
