import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		
		char operator;
	    Double number1, number2, result;

	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number:");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number:");
	    number2 = input.nextDouble();

	    switch (operator) {

	      // performs addition
	      case '+':
	        result = number1 + number2;
	        System.out.println("Output:");
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction
	      case '-':
	        result = number1 - number2;
	        System.out.println("Output:");
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication
	      case '*':
	        result = number1 * number2;
	        System.out.println("Output:");
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division
	      case '/':
	        result = number1 / number2;
	        System.out.println("Output:");
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }

	}
