package snake;
import java.util.Random;
import java.util.Scanner;

public class UC7 {
		
			static int PlayerPos=0;
			static int dicenum;
			static int Pos;
			static int count=0;
			static int currentPlayer=1;
			static int Player1=0;
			static int Player2=0;
			
			static int calculatePlayer(int PlayerPos,int dicenum) {
				Random rand = new Random();
				int choice = rand.nextInt(3);
				//System.out.println(choice);
				switch(choice) {
					case 0:
						PlayerPos += 0;
						System.out.println("No Play");
						break;
					case 1:
						System.out.println("Ladder");
						if(PlayerPos<100) {
							PlayerPos += dicenum;
							Random r = new Random();
							dicenum = 1 + r.nextInt(6);
							System.out.println(dicenum);
							PlayerPos += dicenum;
							break;
						}
					case 2:
						System.out.println("Snake bite");
						PlayerPos-=dicenum;
						if(PlayerPos<0) {
							PlayerPos=0;
						}
						break;
				}
				return PlayerPos;
			}
			
			public static void main(String[] args) {
					while(PlayerPos <100) {
						if(PlayerPos>100)
							continue;
						UC7 u = new UC7();
						String str;
						Scanner sc = new Scanner(System.in);
						if(currentPlayer==1) {
							System.out.println("\nFirst Player Turn");
						}
						else {
							System.out.println("\nSecond Player Turn");
						}
						// TODO Auto-generated method stub
						System.out.println("Enter d to roll dice");
						str = sc.next();
						Random r = new Random();
						dicenum = 1 + r.nextInt(6);
						System.out.println("Dice number=" +dicenum);
						System.out.println("Number of throws to win : "+ count++);
						if(currentPlayer==1) {
							Player1 = calculatePlayer(Player1,dicenum);
							System.out.println("First Player - " + Player1);
							System.out.println("Second Player - " + Player2);
							if(Player1==100)
							{
								System.out.println("\nFirst player wins");
								//return;
							}
						}
					else
					{
						Player2 = calculatePlayer(Player2,dicenum);
						System.out.println("First Player - " + Player1);
						System.out.println("Second Player - " + Player2);
						if(Player2==100)
						{
							System.out.println("\nSecond player wins");
							//return;
						}
					}
					currentPlayer= -currentPlayer;
				}				

		}
	}

			

