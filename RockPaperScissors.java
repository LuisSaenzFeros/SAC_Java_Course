import java.util.Scanner;

public class RockPaperScissors{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

	String P1;
	String P2;
	String answer;

	System.out.println("Lets play rock paper scissors!\n" + "Rock = R, Paper = P, and Scissors = S");
	
	System.out.print("Player 1 please enter your move: ");
	
	P1 = input.next();
	P1 = P1.toUpperCase();

	System.out.print("Player 2 please enter your move: ");

	P2 = input.next();
	P2 = P2.toUpperCase();

	if (P1.equals(P2))
		System.out.println("It's a tie!");
	if (P1.equals("R"))
		if (P2.equals("S"))
		System.out.println("Rock crushes Scissors. Player 1 wins");
	if (P1.equals("R"))
		if (P2.equals("P"))
		System.out.println("Paper covers Rock. Player 2 wins");
	if (P1.equals("P"))
		if (P2.equals ("R"))
		System.out.println("Paper covers Rock. Player 1 Wins");
	if (P1.equals("P"))
		if (P2.equals ("S"))
		System.out.println("Scissors cut Paper. Player 2 wins");
	if (P1.equals("S"))
		if (P2.equals("P"))
		System.out.println("Scissors cut Paper.Player 1 wins");
	if (P1.equals("S"))
		if (P2.equals("R"))
		System.out.println("Rock crushes Scissors.Player 2 wins");
	else 
		System.out.println("Invalid user input.");


	
	}
}


	
