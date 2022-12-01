package devoir;

public class Robot {
	String nom;
	int vie ;
	public Robot () {
		this.vie = 10;
	}
	public Robot(String nom) {
		this.nom = nom;
	}
	public Robot(String nom ,int vie) {
		this.nom = nom;
		this.vie = vie;
	}
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	
	void fire (Robot s) {
		if(s.vie<= 0) {
			System.out.println(s.nom +" est mort ");
		}
		else {
			s.vie -= 2 ;
			System.out.println(s.nom +" a ete touche par "+ this.nom +". vie = "+ s.vie);
		}
		
	}
	public boolean isdead (Robot s) {
		if(s.vie == 0) {
			System.out.println(s.nom+ " est mort .");
			return true;
		}
		return false;
	}
	public static void main (String[]args) {
		Robot bob = new Robot("Robot bob",10);
		Robot data = new Robot("Robot data",10);
		System.out.println(bob.nom +" , "+ data.nom);
		System.out.println(bob.vie +" , "+ data.vie);
		bob.fire(data);
		
	}
		
	}