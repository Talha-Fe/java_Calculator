package calculator;
import java.text.DecimalFormat;
import java.util.Scanner;
public class calculator {

	private static double calculatePercentage(double firstNum, double secondNum) {
		
	    float percentFloat = (float)secondNum / 100;
	    float outValueFloat = (float)(firstNum * percentFloat);
	    return Math.round(outValueFloat);
		
	}
	
	public static void main(String[] args) {

		DecimalFormat format = new DecimalFormat("0.#"); // gereksiz sayıları silmek için (.0)
		Scanner userIn = new Scanner(System.in);
		
		double firstNum;
		double secondNum;
		double result;
		double remainder;
		
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
				
				System.out.print("Enter a number: ");
				firstNum = userIn.nextDouble();
				System.out.print("Enter another number: ");
				secondNum = userIn.nextDouble();
				
				result = firstNum * secondNum;
				
				System.out.print("Your result is: ");
				System.out.println(format.format(result));
				
				break;
				
			case "D":
				
				System.out.print("Enter a number: ");
				firstNum = userIn.nextDouble();
				System.out.print("Enter another number: ");
				secondNum = userIn.nextDouble();
				
				result = firstNum / secondNum;
				remainder = firstNum % secondNum;
				
				System.out.print("Your result is: ");
				System.out.println(format.format(result));
				System.out.println("And remainder is: ");
				System.out.println(format.format(remainder));
				
				
				break;
				
			case "E":
				
				System.out.print("Enter a percentage: ");
				firstNum = userIn.nextDouble();
				System.out.print("Enter a number: ");
				secondNum = userIn.nextDouble();
				
				result = calculatePercentage(secondNum, firstNum);
				
				System.out.print("Your result is: ");
				System.out.println(format.format(result));
				
				break;
				
		
		}		
	}

}
