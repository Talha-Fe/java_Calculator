package calculator;
import java.text.DecimalFormat;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {

		DecimalFormat format = new DecimalFormat("0.#");
		Scanner userIn = new Scanner(System.in);
		
		double firstNum;
		double secondNum;
		double result;
		
		
		System.out.print("Addition(A) # Subtraction(B) # Multiplication(C) # Subdivide(D) # Percentage(E): ");
		String choice = userIn.next();
		
		switch(choice) {
		
			case "A":
				
				System.out.print("Enter a number: ");
				firstNum = userIn.nextDouble();
				System.out.print("Enter another number: ");
				secondNum = userIn.nextDouble();
				
				result = firstNum + secondNum;

				System.out.print("Your result is: ");
				System.out.println(format.format(result));
				
				break;
				
			case "B":
				
				System.out.print("Enter a number: ");
				firstNum = userIn.nextDouble();
				System.out.print("Enter another number: ");
				secondNum = userIn.nextDouble();
				
				result = firstNum - secondNum;
				
				System.out.print("Your result is: ");
				System.out.println(format.format(result));
				
				break;
				
			case "C":
				
				
				
				break;
				
			case "D":
				
				
				
				break;
				
			case "E":
				
				
				
				break;
		
		}
		
		
	}

}
