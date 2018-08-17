package xyz.camiloarguello.pokemones;

public class Pokemon {
	
	public String name;
	public double attack;
	public double life;
	
	public Pokemon(String name, double attack, double life) {
		this.name = name;
		this.attack = attack;
		this.life = life;
	}
	
	public void sayYourName() {
		System.out.println("My name is " + this.name);
	}
	public void sum(int a, int b) {
		System.out.println("The sum is " + (a + b) ); //a + b;
	}
	public void dif(int a, int b) {
		System.out.println("The difference is " + (a - b) ); //a - b;
	}
	
	public double lifeAttacked(double impactAttack) {
		isDead();
		return this.life -= impactAttack;
	}
	public void isDead() {
		if(this.life <= 0) {
			System.out.println(this.name + " has died");
			System.exit(1);
		}
	}
	
}
