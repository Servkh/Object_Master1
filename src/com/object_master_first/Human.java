package com.object_master_first;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;	
	
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	public Human attack(Human attacked) {
		attacked.health -= this.strength;
		return this;
	}
	public void displayHealth() {
		System.out.println(this.health);
	}

}
