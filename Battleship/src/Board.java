
public class Board
	{
		static String [][] board;
		public static void createBoard()
		{
			board = new String [5][5];
			for (int i = 0; i < 5; i++)
				{
					for (int j = 0; j < 5; j++)
						{
							board [i][j] = " ";
						}
				}
		}
		public static void display()
		{
			System.out.println( "      1          2          3          4          5     ");
			System.out.println( "  ----------------------------------------------------- ");
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "A |    " + board [0][0] + "    |    " + board [0][1] + "     |    " + board [0][2] + "     |    " + board [0][3] + "     |    " + board [0][4] + "    |    ");
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "  ----------------------------------------------------- ");
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "B |    " + board [1][0] + "    |    " + board [1][1] + "     |    " + board [1][2] + "     |    " + board [1][3] + "     |    " + board [1][4] + "    |    ");
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "  ----------------------------------------------------- ");
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "C |    " + board [2][0] + "    |    " + board [2][1] + "     |    " + board [2][2] + "     |    " + board [2][3] + "     |    " + board [2][4] + "    |    " );
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "  ----------------------------------------------------- ");
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "D |    " + board [3][0] + "    |    " + board [3][1] + "     |    " + board [3][2] + "     |    " + board [3][3] + "     |    " + board [3][4] + "    |    " );
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "  ----------------------------------------------------- ");
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "E |    " + board [4][0] + "    |    " + board [4][1] + "     |    " + board [4][2] + "     |    " + board [4][3] + "     |    " + board [4][4] + "    |    " );
			System.out.println( "  |         |          |          |          |         |");
			System.out.println( "  ----------------------------------------------------- ");
			System.out.println();
		}
		
	}

