//Anuja Nagare: anuja.nagare@uga.edu

public class Hero implements Character {

public String weapon = "The Force";
	
	public void heal() {
		System.out.println("hero heals you!");
	}
	
	public void attack() {
		System.out.println("hero attacks enemy!");		
	}
	
	public String getWeapon() {
		return weapon;
	}
	public Hero() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("draw out weapon");

	}
}
