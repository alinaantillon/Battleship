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
								System.out.println("If you hit the computer's ship, an X will appear. If you miss, a ~ will appear.");
							boolean playing = true;
							while (playing)
									{
									Scanner userInput3 = new Scanner(System.in);
									System.out.println("What is the row you want to attack?");
									int counter = 0;
									int rowInput = userInput3.nextInt();
									int x = rowInput;
									counter++;
									int row;
									row = rowInput-1;
									counter++;
									Scanner userInput4 = new Scanner(System.in);
									System.out.println("What is the column you want to attack?");
									int columnInput = userInput4.nextInt();
									int y = columnInput;
									counter++;
									int column;
									column = columnInput-1;
									if (rowInput == 1 && columnInput == 1)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[0][0] = "X";
											Board.display();
										}
									else if (rowInput == 1 && columnInput == 2)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[0][1] = "X";
											Board.display();
										}
									else if (rowInput == 1 && columnInput == 3)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[0][2] = "X";
											Board.display();
										}
									else if (rowInput == 3 && columnInput == 3)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[2][2] = "X";
											Board.display();
										}
									else if (rowInput == 3 && columnInput == 4)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[2][3] = "X";
											Board.display();
										}
									else if (rowInput == 4 && columnInput == 2)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[3][1] = "X";
											Board.display();
										}
									else if (rowInput == 4 && columnInput == 5)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[3][4] = "X";
											Board.display();
										}
									else if (rowInput == 5 && columnInput == 5)
										{
											System.out.println("You hit one of your opponents ships!");
											Board.board[4][4] = "X";
											Board.display();
										}
									else
										{
											System.out.println("You missed your opponent's ships!");
											Board.board[x-1][y-1] = "~";
											Board.display();
											System.out.println("Try again!");
										}
									if (Board.board[0][0] =="X" && Board.board[0][1] =="X" && Board.board[0][2] =="X")
										{
											System.out.println("You sunk one of the computers ships!");
										}
									else if (Board.board[2][2] =="X" && Board.board[2][3] =="X")
										{
											System.out.println("You sunk one of the computers ships!");
										}
									else if (Board.board[3][4] =="X" && Board.board[4][4] =="X")
										{
											System.out.println("You sunk one of the computers ships!");
										}
									else if (Board.board[3][1] =="X")
										{
											System.out.println("You sunk one of the computers ships!");
										}
									if (Board.board[0][0] =="X" && Board.board[0][1] =="X" && Board.board[0][2] =="X" && Board.board[2][2] =="X" && Board.board[2][3] =="X" && Board.board[3][4] =="X" && Board.board[4][4] =="X" && Board.board[3][1] =="X")
										{
											System.out.println("You won! You sunk all of the computer's ships in " + counter/2 + " tries!");
										}
									}
								System.out.println("Good job! You sunk all of your opponent's ships!");
								
							}
					}
			}

//fix duplicates
//how to tell if all sunk
	}
