package IHM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Fenetre 
{
	public static void main(String[] args)
	 {
	  JFrame f = new JFrame();
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250, 150));
	  f.setVisible(true);
	  f.setTitle("Gestion places DST");
	  f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	  f.setContentPane(panel);
	  panel.setBackground(Color.white);
	  f.setBackground(Color.gray);
	  panel.setLayout(new FlowLayout());
	  f.pack();
	  JLabel label = new JLabel("Attributions des places en salle de DST");
	  panel.add(label);
	  label.setFont(new Font("Serif", Font.BOLD, 40));
	  label.setForeground(Color.pink);
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  
	  JLabel label1 = new JLabel ("Veuillez selectionner les classes");
	  panel.add(label1);
	  label1.setFont(new Font("Serif", Font.ITALIC, 20));
	  
	  
	 
	  JButton bouton1 = new JButton("MCO1");
	  
	  bouton1.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent arg0) {
			  try {
				  Connection c = null;
				  Class.forName("com.mysql.cj.jdbc.Driver");
				   String url = "jdbc:mysql://localhost/dst", user = "root", password = "";
				

				   c = DriverManager.getConnection(url, user, password);
				   
				   String req4 = "select prenom_eleve, nom_eleve from eleve where id_classe = '1' order by rand()";
				   Statement s4 = c.createStatement();
				   ResultSet rs4 = s4.executeQuery(req4);
			  
				   while (rs4.next())
				   {
					   String prenom = rs4.getString(1);
					   System.out.println(prenom);
					   String nombre = rs4.getString(2);
					   System.out.println(nombre);
					   
				   }
			  }
			  catch(Exception e) {System.out.println(e);
		  }
		  }});
	  
	  JButton bouton2 = new JButton("MCO2");
	  
	  bouton2.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent arg0) {
			  try {
				  Connection c = null;
				  Class.forName("com.mysql.cj.jdbc.Driver");
				   String url = "jdbc:mysql://localhost/dst", user = "root", password = "";
				

				   c = DriverManager.getConnection(url, user, password);
				   
				   String req5 = "select prenom_eleve, nom_eleve from eleve where id_classe = '2' order by rand()";
				   Statement s5 = c.createStatement();
				   ResultSet rs5 = s5.executeQuery(req5);
			  
				   while (rs5.next())
				   {
					   String prenom = rs5.getString(1);
					   System.out.println(prenom);
					   String nombre = rs5.getString(2);
					   System.out.println(nombre);
					   
				   }
			  }
			  catch(Exception e) {System.out.println(e);
		  }
		  }});
	  JButton bouton3 = new JButton("NDRC1");
	  JButton bouton4 = new JButton("NDRC2");
	  JButton bouton5 = new JButton("SIO1");
	  JButton bouton6 = new JButton("SIO2");
	  
	  
	  
	  panel.add(bouton1);
	  bouton1.setBounds(400, 250, 100, 50);
	  
	  panel.add(bouton2);
	  bouton2.setBounds(400, 250, 100, 50);
	  
	  panel.add(bouton3);
	  bouton3.setBounds(400, 250, 100, 50);
	  
	  panel.add(bouton4);
	  bouton4.setBounds(400, 250, 100, 50);
	  
	  panel.add(bouton5);
	  bouton5.setBounds(400, 250, 100, 50);
	  
	  panel.add(bouton6);
	  bouton6.setBounds(400, 250, 100, 50);
	  
	  
	  new MyFrame();
	  
	  
	 }
	
	
	
	
}
