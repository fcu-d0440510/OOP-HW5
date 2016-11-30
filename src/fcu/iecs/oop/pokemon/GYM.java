package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2){
		Random rand=new Random();
		int a;
		a=rand.nextInt(2);
		
		if(a==0){
			p1.svae_cp(p1.get_cp()+500);
			System.out.println("winner is "+p1.get_name());
			System.out.println("CP is "+p1.get_cp());
		}
		else{
			p2.svae_cp(p2.get_cp()+500);
			System.out.println("winner is "+p2.get_name());
			System.out.println("CP is "+p2.get_cp());
		}
	}

}
