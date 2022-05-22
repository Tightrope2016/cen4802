 

public class FibonacciTest {
	
	//On the main method has the value of n which 10 is passed and y which is the return value of the function 
	//when the nth term is passed as parameter.
    public static void main(String[] args) {
        int n = 10;
        int y = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");
    }

    //recursive fibonacci function that accepts the variable number n and returns the nth term of the series.
    public static int fibonacci(int n) {
    	
    	//recursive function where the value of n is either 1 or 0 it will return 1 or 0 respectively.
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        
       //return by calling the function (which were n - 1 and n - 2).
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}