package snake;

import java.util.Random;

public class UC3 {

	static int PlayerPos=0;
	static int dicenum;
	void Snake() {
		// TODO Auto-generated method stub
		PlayerPos-=dicenum;
		System.out.println("Snake bite");
		System.out.println("Player Position ="+PlayerPos);
		System.out.println();
	}
	void Ladder() {
		// TODO Auto-generated method stub
		PlayerPos+=dicenum;
		System.out.println("Ladder");
		System.out.println("Player Position ="+PlayerPos);
		System.out.println();
		
	}
	void NoPlay() {
		// TODO Auto-generated method stub
		PlayerPos += 0;
		System.out.println("No Play");
		System.out.println("Player Position ="+PlayerPos);
		System.out.println();
		
	}	
	public static void main(String[] args) {
				while(PlayerPos <100) {
				UC3 u = new UC3();
				// TODO Auto-generated method stub
				Random rand = new Random();
				dicenum = 1 + rand.nextInt(6);
				System.out.println(dicenum);
				PlayerPos+=dicenum;
				System.out.println("Player Position="+ PlayerPos);
				int choice = rand.nextInt(3);
				System.out.println(choice);
				switch(choice) {
					case 0:
						u.NoPlay();
						break;
					case 1:
						u.Ladder();
						break;
					case 2:
						u.Snake();
						break;
				}
				}				
	}
}

	

				

		

