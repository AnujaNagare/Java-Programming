//Anuja Nagare: anuja.nagare@uga.edu

public class Enemy implements Character{

	public String weapon = "lightsaber";
	
	public void heal() {
		System.out.println("Enemy heals you!");
	}
	
	public void attack() {
		System.out.println("Enemy attacks you!");		
	}

	public String getWeapon() {
		return weapon;
	}
	
	public Enemy() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("draw out weapon");

	}

}
