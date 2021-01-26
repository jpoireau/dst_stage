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
		
		//comboBox.setEditable(true); 						// On peut écrire ce qu'on veut dans la liste au lieu de sélectionner
		//System.out.println(comboBox.getItemCount()); 		// Compte tous les choix qu'il y a dans la liste
		//comboBox.addItem("Licence"); 						// Ajoute ce qu'on veut dans la liste déroulante
		//comboBox.insertItemAt("Licence Eco", 0); 			// Ajoute à un index précis
		//comboBox.setSelectedIndex(0); 					// Sélectionne une valeur prédéfinie de la liste
		//comboBox.removeItem("Licence"); 					// supprime un item
		//comboBox.removeItemAt(0); 						// supprime à l'aide de l'index
		//comboBox.removeAllItems(); 						// supprime tout de la liste
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());		// Affiche les noms sélectionnés
			//System.out.println(comboBox.getSelectedIndex()); 	// Affiche les index des items
		}
		
	}

}
