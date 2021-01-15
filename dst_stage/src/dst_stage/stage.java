package dst_stage;

import java.util.Random;

public class stage 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Quelle classe souhaitez-vous ordonnée ? ");
		
		
		System.out.println("Quelle rangées attribuer à la classe ? (de A à I) ");
		
		
	/*	int[] tab1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; // déclaration d'un tableau avec 2 lignes et 3 colonnes ( 2 dimensions ) dont les valeurs SONT précisées
		for(int i = 0; i < tab1.length; i++) 
		{
			System.out.println(tab1[i]);
			
		}
	*/	
		int number = getRandom(tab1);
		
		System.out.println(number); 

	}
	
	static int[] tab1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; // déclaration d'un tableau avec 2 lignes et 3 colonnes ( 2 dimensions ) dont les valeurs SONT précisées

	public static int getRandom(int[] tab1) 
	{ 
	    int rnd = new Random().nextInt(tab1.length); 
	    return tab1[rnd]; 
	} 
	

}