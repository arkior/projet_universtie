package gestionUniversite_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test_connectionBDD {

	public static void main(String[] args)
	{
		Connection connect = null;
		try 
		{
			String protocol = "jdbc:";
			String sous_protocol = "mysql://";
			String ip = "localhost:3306/";
			String baseDeDonnees = "p_universite";
			String parametre = "?useSSL=false&serverTimezone=Europe/Paris";
			String url = protocol+sous_protocol+ip+baseDeDonnees+parametre;
			
			
			// cette ligne me connecte a la base de donnees
			connect = DriverManager.getConnection(url,"toto","toto");
			System.out.println("succes");
			
			//INSERT INTO table (nom_colonne_1, nom_colonne_2, ...
				//	 VALUES ('valeur 1', 'valeur 2', ...)
			
			Scanner sc = new Scanner(System.in);
			System.out.println("quel est votre nom ?");
			String nom = sc.next();
			
			
			String requete = "UPDATE p_universite.directeur SET nom_directeur =?,prenom_directeur=?,password_directeur=?,email_directeur=? WHERE id_directeur=?";
			PreparedStatement prepareRequete = connect.prepareStatement(requete);
			prepareRequete.setString(1,nom);
			prepareRequete.setString(2,"Christophe");
			prepareRequete.setString(3,"titi");
			prepareRequete.setString(4,"gchristophe@hotmail.fr");
			prepareRequete.setInt(5,1);
			
			int resultat = prepareRequete.executeUpdate();
			
			if(resultat == 1) 
			{
				System.out.println("vos valeurs ont bien ete enregistrees dans la base de donnees");
			}
			else
			{
				System.out.println("vos valeurs ne sont pas  dans la base de donnees");
			}
			
			
			
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(connect != null) 
				{
					connect.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
