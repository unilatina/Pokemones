package xyz.camiloarguello.pokemones;
import java.

public class Main {

	public static void main(String[] args) {
		
		double lifePikachu = 100;
		double lifeJigglypuff = 100;
		double attackPikachu = 20;
		double attackJiggly = 10;
		
		Pokemon pikachu = new Pokemon("Pikachu",attackPikachu ,lifePikachu);
		Pokemon jigglypuff = new Pokemon("Jigglypuff", attackJiggly ,lifeJigglypuff);
		
		// Say hello
		pikachu.sayYourName();
		jigglypuff.sayYourName();
		
		// Sum two numbers
		pikachu.sum(40, 1);
		jigglypuff.dif(76, 18);
		
		
		/*
		for(int turn = 0; turn<10; turn++) {
			pikachu.lifeAttacked(attackJiggly);	
			jigglypuff.lifeAttacked(attackPikachu);
			System.out.println("Jigglypuff life " + jigglypuff.life);
			System.out.println("Pikachu life " + pikachu.life);
		}
		
		jigglypuff.lifeAttacked(attackPikachu);
		
		System.out.println("Jigglypuff life " + jigglypuff.life);
		
		pikachu.lifeAttacked(attackJiggly);	
		
		System.out.println("Pikachu life " + pikachu.life);
		
		jigglypuff.lifeAttacked(attackPikachu);
		
		System.out.println("Jigglypuff life " + jigglypuff.life);
		
		pikachu.lifeAttacked(attackJiggly);	
		
		System.out.println("Pikachu life " + pikachu.life);
		
		jigglypuff.lifeAttacked(attackPikachu);
		
		System.out.println("Jigglypuff life " + jigglypuff.life);
		
		pikachu.lifeAttacked(attackJiggly);	
		
		System.out.println("Pikachu life " + pikachu.life);
		
		jigglypuff.lifeAttacked(attackPikachu);
		
		System.out.println("Jigglypuff life " + jigglypuff.life);
		
		pikachu.lifeAttacked(attackJiggly);	
		
		System.out.println("Pikachu life " + pikachu.life);
		
		jigglypuff.lifeAttacked(attackPikachu);
		
		System.out.println("Jigglypuff life " + jigglypuff.life);
		
		pikachu.lifeAttacked(attackJiggly);	
		
		System.out.println("Pikachu life " + pikachu.life);
		
		jigglypuff.lifeAttacked(attackPikachu);
		*/
		
	}

}
