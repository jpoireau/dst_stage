package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class algo {

	public static void main(String[] args) 
	{
		
		Connection c = null;
		  try
		  {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   String url = "jdbc:mysql://localhost/dst", user = "root", password = "";
		   c = DriverManager.getConnection(url, user, password);
		  /*  String req2 = "select* from tables where id_colonne = 'A' order by rand()"; // classe al�atoirement les �l�ves de MCO1
		   Statement s2 = c.createStatement();
		   ResultSet rs2 = s2.executeQuery(req2); */
		   
		   String req4 = "select prenom_eleve, nom_eleve from eleve where id_classe = '1' order by rand()";
		   Statement s4 = c.createStatement();
		   ResultSet rs4 = s4.executeQuery(req4);
		   
		   String req5 = "select prenom_eleve, nom_eleve from eleve where id_classe = '2' order by rand()";
		   Statement s5 = c.createStatement();
		   ResultSet rs5 = s5.executeQuery(req5);
		   
		   String req6 = "select prenom_eleve, nom_eleve from eleve where id_classe = '3' order by rand()";
		   Statement s6 = c.createStatement();
		   ResultSet rs6 = s6.executeQuery(req6);
		   
		   String req7 = "select prenom_eleve, nom_eleve from eleve where id_classe = '4' order by rand()";
		   Statement s7 = c.createStatement();
		   ResultSet rs7 = s7.executeQuery(req7);
		   
		   String req8 = "select prenom_eleve, nom_eleve from eleve where id_classe = '5' order by rand()";
		   Statement s8 = c.createStatement();
		   ResultSet rs8 = s8.executeQuery(req8);
		   
		   String req9 = "select prenom_eleve, nom_eleve from eleve where id_classe = '6' order by rand()";
		   Statement s9 = c.createStatement();
		   ResultSet rs9 = s9.executeQuery(req9);
		   
		   
/*		   String req3 = "update eleve set id_colonne = '1', id_table = '1' where id_eleve = '1'";
		   Statement s3 = c.createStatement();
		   ResultSet rs3 = s3.executeUpdate(req3); */
		   
		 /*  while (rs2.next())
		   {
		    //System.out.println(rs2.getInt(1) + " : " + rs2.getInt(2) + " : " + rs2.getString(3));
		    String nom = rs2.getString(2);
		    System.out.println(nom);
		   } */
		   
		   while (rs4.next())
		   {
			   String prenom = rs4.getString(1);
			   System.out.println(prenom);
			   String nombre = rs4.getString(2);
			   System.out.println(nombre);
			   
		   }
		   
		   while (rs5.next())
		   {
			   String prenom = rs5.getString(1);
			   System.out.println(prenom);
			   String nombre = rs5.getString(2);
			   System.out.println(nombre);
			   
		   }
		   
		   
		   while (rs6.next())
		   {
			   String prenom = rs6.getString(1);
			   System.out.println(prenom);
			   String nombre = rs6.getString(2);
			   System.out.println(nombre);
			   
		   }
		   
		   
		   while (rs7.next())
		   {
			   String prenom = rs7.getString(1);
			   System.out.println(prenom);
			   String nombre = rs7.getString(2);
			   System.out.println(nombre);
			   
		   }
		   
		   while (rs8.next())
		   {
			   String prenom = rs8.getString(1);
			   System.out.println(prenom);
			   String nombre = rs8.getString(2);
			   System.out.println(nombre);
			   
		   }
		   
		   while (rs9.next())
		   {
			   String prenom = rs9.getString(1);
			   System.out.println(prenom);
			   String nombre = rs9.getString(2);
			   System.out.println(nombre);
			   
		   }
		   
		   
		   
		  }
		  catch (ClassNotFoundException e)
		  {
		   System.out.println("Pilote JDBC non install�.");
		  }
		  catch (SQLException e)
		  {
		   System.out.println(e);
		  }
		  finally
		  {
		   try
		   {
		    if (c != null)
		     c.close();
		   }
		   catch (SQLException e)
		   {
		    System.out.println("Impossible de fermer la connection.");
		   }
		  }
		 }
	}


