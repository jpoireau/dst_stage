package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class algo {

	public static void main(String[] args) {
		
		Connection c = null;
		  try
		  {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   String url = "jdbc:mysql://localhost/dst", user = "root", password = "";
		   c = DriverManager.getConnection(url, user, password);
		   String req2 = "select* from eleve where id_classe = 1 order by rand()"; // classe al�atoirement les �l�ves de MCO1
		   Statement s2 = c.createStatement();
		   ResultSet rs2 = s2.executeQuery(req2);
		   
/*		   String req3 = "update eleve set id_colonne = '1', id_table = '1' where id_eleve = '1'";
		   Statement s3 = c.createStatement();
		   ResultSet rs3 = s3.executeUpdate(req3); */
		   
		   while (rs2.next())
		   {
		    //System.out.println(rs2.getInt(1) + " : " + rs2.getInt(2) + " : " + rs2.getString(3));
		    String nom = rs2.getString(5);
		    System.out.println(nom);
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


