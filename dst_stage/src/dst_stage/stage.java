package dst_stage;

import java.util.Random;

public class stage 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Quelle classe souhaitez-vous ordonn�e ? ");
		
		
		System.out.println("Quelle rang�es attribuer � la classe ? (de A � I) ");
		
		
	/*	int[] tab1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; // d�claration d'un tableau avec 2 lignes et 3 colonnes ( 2 dimensions ) dont les valeurs SONT pr�cis�es
		for(int i = 0; i < tab1.length; i++) 
		{
			System.out.println(tab1[i]);
			
		}
	*/	
		int number = getRandom(tab1);
		
		System.out.println(number); 

	}
	
	static int[] tab1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; // d�claration d'un tableau avec 2 lignes et 3 colonnes ( 2 dimensions ) dont les valeurs SONT pr�cis�es

	public static int getRandom(int[] tab1) 
	{ 
	    int rnd = new Random().nextInt(tab1.length); 
	    return tab1[rnd]; 
	} 
	

}