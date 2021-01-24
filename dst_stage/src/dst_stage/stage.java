package dst_stage;

import java.util.Random;

public class stage 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Quelle classe souhaitez-vous ordonnee ? ");
		
		
		int number = getRandom(tab1);
		int res = number; 
		System.out.println(number);
		System.out.println(res);
		
		
	}
	
	static int[] tab1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; // declaration d'un tableau avec 2 lignes et 3 colonnes ( 2 dimensions ) dont les valeurs SONT precisees

	public static int getRandom(int[] tab1) 
	{ 
	    int rnd = new Random().nextInt(tab1.length); 
	    return tab1[rnd]; 
	} 
	

}