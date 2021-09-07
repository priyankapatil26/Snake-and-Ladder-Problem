package snake;
import java.util.Random;

public class UC6 {
		
			static int PlayerPos=0;
			static int dicenum;
			static int Pos;
			static int count=0;
			void Snake() {
				// TODO Auto-generated method stub
				Pos-=dicenum;
				System.out.println("Snake bite");
				System.out.println("Player Position after Snake bite ="+PlayerPos);
				System.out.println();
			}
			void Ladder() {
				// TODO Auto-generated method stub
				System.out.println("Ladder");
				if(Pos<100) {
					PlayerPos+=dicenum;
				}
			
				System.out.println("Player Position after Ladder ="+PlayerPos);
				System.out.println();
				
			}
			void NoPlay() {
				// TODO Auto-generated method stub
				PlayerPos += 0;
				System.out.println("No Play");
				System.out.println("Player Position after No Play="+PlayerPos);
				System.out.println();
				
			}	
			public static void main(String[] args) {
					while(PlayerPos <100) {
						UC6 u = new UC6();
						// TODO Auto-generated method stub
						Random rand = new Random();
						dicenum = 1 + rand.nextInt(6);
						System.out.println("Dice number=" +dicenum);
						System.out.println("Number of throws to win : "+ count++);
						Pos =PlayerPos + dicenum;
						if(Pos>100) 
							continue;
						
						if(Pos==100) {
							System.out.println("You Won");
							break;
						}
						System.out.println("Player Position="+ Pos);
						int choice = rand.nextInt(3);
						//System.out.println(choice);
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
