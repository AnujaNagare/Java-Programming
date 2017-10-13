//Anuja Nagare: anuja.nagare@uga.edu

import java.util.Random;

public class StarWarsInterfacePractice {
	
	public static Character summonCharacter() {
		Random rand = new Random();
		if (Math.abs(rand.nextInt()) % 2 ==0) {
			return new Enemy();
		}
		else {
			return new Hero(); 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enemy darthVadar = new Enemy();
		Hero ObiWanKenobi = new Hero();
		darthVadar.attack();
		ObiWanKenobi.attack();
		
		darthVadar.heal();
		ObiWanKenobi.heal();
		
		System.out.println("Enemy weapon: " + darthVadar.getWeapon());
		System.out.println("Hero weapon: "+ ObiWanKenobi.getWeapon());
		
		Character spy = summonCharacter();
		spy.attack();
		spy.heal();

	}

}
