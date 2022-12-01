package devoir;

public class Arena {
	Robot b1,b2;
	public Arena() {
		
	}
	public Arena(Robot b1,Robot b2) {
		this.b1 = b1;
		this.b2 = b2;
	}
	public Arena figth(Robot b1 , Robot b2) {
		Arena ar = new Arena();
		/*while(b1.vie>0 && b2.vie>0) {
			b1.fire(b2);
			b2.fire(b1);
			if(b1.vie==0) {
				System.out.println("combat terminer. "+ b1.nom +" a gagne le combat." );
			}
			//if(b2.vie==0) {
			//	System.out.println("combat terminer. "+ b1.nom +" a gagne le combat." );
			//}
		}*/
		for(int i = 1;i<7;i++) {
			if (b1.vie >0) {
				b1.fire(b2);
			}
			if(b2.vie >0) {
				b2.fire(b1);
			}
		}
		if(b1.vie>0) {
			System.out.println("combat terminer. "+ b1.nom +" a gagne le combat." );
		}
		if(b2.vie>0) {
			System.out.println("combat terminer. "+ b2.nom +" a gagne le combat." );
		}
		
		return ar;
		
	}
	
	public static void main(String[] args) {
		Robot b1 = new Robot("D2R2",10);
		Robot b2 = new Robot("Data",10);
		Arena A = new Arena(b1,b2);
		System.out.println( b2.vie);
		A.figth(b1, b2);

	}

}
