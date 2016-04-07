import javax.swing.JOptionPane;


public class Dice {

    public static void main(String[] args) {

	JOptionPane.showMessageDialog(null, "Welcom to Luis' Dice Roll Guessing Game");
	
	int pctg;
	int s4;
	int s2;
	int s1;
	int actual;
	int guess;
	String s3;
	boolean playAgain = true;
	int gameNumber = 0;
	boolean win = false;
	int numberWins = 0;{
	
	while (playAgain = true){

		String t1 = 
			JOptionPane.showInputDialog("Type in the number 1 to roll the dice");
		


		s3 = JOptionPane.showInputDialog("Guess 1 for Odd, or 2 for Even");

		s1 = Integer.parseInt(t1);

		guess = Integer.parseInt(s3);
	
		s2 = 1 + (int) (Math.random()*6);{
		
		

		if ((s2 == 1)||(s2 == 3)||(s2 == 5)) {
		
			actual = 1;
			if (guess == actual){
				numberWins += 1;
				JOptionPane.showMessageDialog(null, "Number is: " + s2 + "... Correct" );
			}else 
				JOptionPane.showMessageDialog(null, "Number is: " + s2 + "... Wrong");
		}

		else {
		
			actual = 2;
			if (guess == actual){
				numberWins += 1;
				JOptionPane.showMessageDialog(null, "Number is: " + s2 + "... Correct");
			}else
				JOptionPane.showMessageDialog(null, "Number is: " + s2 + "... Wrong");
	
		

	//if (guess == actual) {
		
		//JOptionPane.showMessageDialog(null, "Number is: " + s2 + "... Correct" );
			//}else JOptionPane.showMessageDialog(null, "Number is: " +s2 +"... Incorrect");	
	// ((s2 == 2)||(s2 == 4)||(s2 == 6))
		}
	
	gameNumber += 1;
	JOptionPane.showMessageDialog(null, "Number of times played: " + gameNumber);
	JOptionPane.showMessageDialog(null, "Number of wins: " + numberWins);
	pctg = (numberWins*100/gameNumber);
	JOptionPane.showMessageDialog(null, "Win Percentage: " + pctg);
	String t3 = 
	JOptionPane.showInputDialog("Would you like to play again? Type 1 for YES or 2 for NO");
	s4 = Integer.parseInt(t3);
	
	if (s4 == 2){
		playAgain = false;
		System.exit(0);
		}else
			playAgain = true;
		}
	}
	}
}
}

	
			

