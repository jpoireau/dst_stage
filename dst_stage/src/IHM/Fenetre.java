package IHM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

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
	 // f.setSize(200, 200);
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
	  JButton bouton2 = new JButton("MCO2");
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
