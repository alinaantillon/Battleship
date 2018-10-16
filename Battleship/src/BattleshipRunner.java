import java.util.Scanner;

public class BattleshipRunner
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Board.createBoard();
				Board.display();
				playGame();
			}
		public static void playGame()
		{
				Scanner userInput = new Scanner (System.in);
				System.out.println("Would you like to play a game with the grid above? (yes or no)?");
				String choice = userInput.nextLine();
				if (choice.equals("no"))
					{
						System.out.println("Okay! Have a good day!");
					}
				else
					{
						System.out.println("The game you will be playing today will be Battleship."); 
						System.out.println("Do you know how to play?");
						Scanner userinput2 = new Scanner(System.in);
						String answer = userinput2.nextLine();
						if (answer.equals("no"))
							{
								System.out.println("You might want to learn before playing");
							}
						else
							{
								System.out.println("Okay then let's play!");
								System.out.println("The computer has placed their ships and you have to try and sink all of them.");
								System.out.println("The computer has a ship that is 3 squares long, two ships that are 2 squares long, and a ship that is 1 square long.");
							boolean playing = true;
							while (playing)
									{
									Scanner userInput3 = new Scanner(System.in);
									System.out.println("What is the row you want to attack?");
									int counter = 0;
									String rowInput = userInput3.nextLine();
									counter++;
									rowInput = rowInput.substring(0,1);
									int row;
									rowInput.toUpperCase();
									if (rowInput.equals("A"))
												{
												row = 0;
												}
									if (rowInput.equals("B"))
												{
												row = 1;
												}
									if (rowInput.equals("C"))
												{
												row = 2;
												}
									if (rowInput.equals("D"))
												{
												row = 3;
												}
									if (rowInput.equals("E"))
												{
												row = 4;
												}
									Scanner userInput4 = new Scanner(System.in);
									System.out.println("What is the column you want to attack?");
									int columnInput = userInput4.nextInt();
									counter++;
									int column;
									column = columnInput-1;
									if (rowInput.equals("A") && columnInput == 1)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[0][0] = "x";
											Board.display();
										}
									else if (rowInput.equals("A") && columnInput == 2)
										{
											System.out.println("You hit one of your opponents ships!");
										}
									else if (rowInput.equals("A") && columnInput == 3)
										{
											System.out.println("You hit one of your opponents ships!");
										}
									else if (rowInput.equals("C") && columnInput == 3)
										{
											System.out.println("You hit one of your opponents ships!");
										}
									else if (rowInput.equals("C") && columnInput == 4)
										{
											System.out.println("You hit one of your opponents ships!");
										}
									else if (rowInput.equals("D") && columnInput == 2)
										{
											System.out.println("You hit one of your opponents ships!");
										}
									else if (rowInput.equals("D") && columnInput == 5)
										{
											System.out.println("You hit one of your opponents ships!");
										}
									else if (rowInput.equals("E") && columnInput == 5)
										{
											System.out.println("You hit one of your opponents ships!");
										}
									else
										{
											System.out.println("You missed your opponent's ships!");
											System.out.println("Try again!");
										}
									}
								System.out.println("You sunk all of your opponent's ships!");
								System.out.println("Good job!");
								
							}
					}
			}
//place x's in the hit places
//place -'s in the missed places
//fix duplicates
//how to tell if all sunk
	}
