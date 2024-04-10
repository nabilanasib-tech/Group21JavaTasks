package week1.question02;

public class Oleksandra {

//Method 1.
    public static int divideWithoutOperator(int divided, int divisor){
        // Handle division by zero
        if(divisor == 0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        int quotient = 0;

        //Subtract divisor from divided until it becomes less than divisor
        while(divided >= divisor){
            divided -= divisor;
            quotient++;
        }
        return quotient;

    }

    public static void main(String[] args) {
        int result = divideWithoutOperator(10,2);
        System.out.println(result);

    }
    // Method 2.

    public static int dividesWithoutOperator(int dividend, int divisor) {
        // Check for division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Determine the sign of the result
        int sign = 1;
        if (dividend*divisor<0) {
            sign = -1;
        }

        // Convert the numbers to positive to simplify the calculation
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);

        // Perform the division
        int quotient = 0;
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            quotient++;
        }

        // Apply the sign to the result
        quotient *= sign;

        return quotient;
    }
}
/*
2. Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator
 */