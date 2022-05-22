import java.util.Scanner;

	// 1, 1, 2, 3, 5, 8, 13, 21, 34...
	
public class TestFibonacci {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 1;
		int fibonacci_number = 0;
		int number_position;
		int counter;
		
		System.out.println("The First two numbers of the Fibonacci sequence are: " + number1 + " and " + number2);
		
		System.out.println("Please enter the position of the Fibonacci" );
		
		number_position = console.nextInt();
		
		if(number_position == 1) {
			fibonacci_number = 1;
		}else if (number_position == 2) {
			fibonacci_number = number2;
		}else {
			counter = 3;
			
			while(counter <= number_position) {
				fibonacci_number = number2 + number1;
				number1 = number2;
				number2 = fibonacci_number;
				counter++;
			}
		}
		System.out.println("The desired " + number_position + "th Fibonacci number is: " + fibonacci_number);

	}//close main

} //close class
