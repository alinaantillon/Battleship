import java.util.Scanner;

public class BattleshipRunner
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Scanner userinput = new Scanner(System.in);
				System.out.println("Would you like to play a game?(Yes or no)");
				String decision = userinput.nextLine();
				if (decision.equals("no"))
					{
						System.out.println("Okay! Have a good day!");
					}
				else
					{
						System.out.println("The game you will be playing today will be Battleship. Do you know how to play?");
						Scanner userinput2 = new Scanner(System.in);
						String answer = userinput.nextLine();
						if (answer.equals("no"))
							{
								System.out.println("You might want to learn before playing");
							}
						else
							{
								System.out.println("Okay then let's play!");
								Scanner userinput3 = new Scanner(System.in);
								System.out.println("What is the row you want to attack?");
								rowInput = move.substring(0,1)
										if (rowInput.equals("A"))|| (rowInput.equals("a"))
											{
												row = 0;
											}
								Scanner userinput = new Scanner(System.in);
								System.out.println("What is the column you want to attack?");
								
								Board.createBoard();
								Board.display();
							}
					}
				

			}

	}
