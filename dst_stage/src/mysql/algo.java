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
		   String req2 = "select* from eleve where id_classe = 1 order by rand()"; // classe aléatoirement les élèves de MCO1
		   Statement s2 = c.createStatement();
		   ResultSet rs2 = s2.executeQuery(req2);
		   
		   
		   while (rs2.next())
		   {
		    System.out.println(rs2.getInt(1) + " : " + rs2.getInt(2) + " : " + rs2.getString(3));
		   
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


