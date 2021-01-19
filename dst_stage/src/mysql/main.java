package mysql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
	 public static void main(String[] args)
	 {
	  Connection c = null;
	  try
	  {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   String url = "jdbc:mysql://localhost/dst", user = "root", password = "";
	   c = DriverManager.getConnection(url, user, password);
	   String req = "select* from classe;";
	   Statement s = c.createStatement();	
	   // s.execute(sql: " insert into classe(id_classe, nom_classe) values (7,'Licence')"); // exemple pour insérer des nouvelles valeurs dans une table 
	   ResultSet rs = s.executeQuery(req); 	// Pour lire/récupérer qqchose d'une base de donnée
	   while (rs.next()) 					// la requete peut avoir plusieurs résultats donc pour chaque itération il va afficher le résultat
	   {
	    System.out.println(rs.getInt(1) + " : " + rs.getString(2)); // On récupère l'id de la clonne 1 et le nom de la colonne 2
	    
	    /* 
	    
	    System.out.println("id : "+ rs.getInt(req));
	      
	      
	    */
		
	   }
	  }
	  catch (ClassNotFoundException e)
	  {
	   System.out.println("Pilote JDBC non installé.");
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