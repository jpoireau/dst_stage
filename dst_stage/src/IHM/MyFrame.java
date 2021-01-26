package IHM;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JComboBox comboBox;
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] classes = {"MCO1", "MCO2", "NDRC1", "NDRC2", "SIO1", "SIO2"};
		comboBox = new JComboBox(classes);
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true); 						// On peut �crire ce qu'on veut dans la liste au lieu de s�lectionner
		//System.out.println(comboBox.getItemCount()); 		// Compte tous les choix qu'il y a dans la liste
		//comboBox.addItem("Licence"); 						// Ajoute ce qu'on veut dans la liste d�roulante
		//comboBox.insertItemAt("Licence Eco", 0); 			// Ajoute � un index pr�cis
		//comboBox.setSelectedIndex(0); 					// S�lectionne une valeur pr�d�finie de la liste
		//comboBox.removeItem("Licence"); 					// supprime un item
		//comboBox.removeItemAt(0); 						// supprime � l'aide de l'index
		//comboBox.removeAllItems(); 						// supprime tout de la liste
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());		// Affiche les noms s�lectionn�s
			//System.out.println(comboBox.getSelectedIndex()); 	// Affiche les index des items
		}
		
	}

}
