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
	  f.setSize(200, 200);
	  JLabel label = new JLabel("Attributions des places en salle de DST");
	  panel.add(label);
	  label.setFont(new Font("Serif", Font.BOLD, 40));
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}
