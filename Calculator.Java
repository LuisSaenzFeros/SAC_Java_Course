import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int s1 ;
	int s2 ;
	int sum;
	int difference;
	int product;
	float quotient;
	String operator;
	double answer = 0;

	
	Scanner one = new Scanner(System.in);
	System.out.print("Enter a number: ");
	s1 = one.nextInt();

	System.out.println("+ for addition");
	System.out.println("- for substraction");
	System.out.println("* for multiplication");
	System.out.println("/ for division");

	System.out.print("Enter an operator from the list mentioned above: ");
	operator = one.next();

	Scanner two = new Scanner(System.in);
	System.out.print("Enter another number: ");
	s2 = two.nextInt();

	
    if (operator.equals ("+")){
        answer = s1 + s2;
    }
    else if (operator.equals ("-")){
        answer = s1 - s2;
    }
    else if (operator.equals ("*")){
        answer = s1 * s2;
    }
    else if (operator.equals ("/")){
            answer = s1 / s2;
    }

    System.out.println("First number:" + s1);
    System.out.println("Operator:" + operator);
    System.out.println("Second number:" + s2);

    System.out.println("Answer: " + answer);
}


}