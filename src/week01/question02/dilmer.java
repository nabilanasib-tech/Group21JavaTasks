package week01.question02;

public class dilmer {

    public static void main(String[] args) {


    }

    //divide
    public static int simpleDivide(int a, int b) {

        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }

        return count;
    }

    // found this answer in the internet
    public static int binaryDivide(int dividend, int divisor) {
        int current = 1;
        int denom = divisor;
        // This step is required to find the biggest current number which can be
        // divided with the number safely.
        while (denom <= dividend) {
            current <<= 1;
            denom <<= 1;
        }
        // Since we may have increased the denominator more than dividend
        // then we need to go back one shift, and same would apply for current.
        denom >>= 1;
        current >>= 1;
        int answer = 0;
        // Now deal with the smaller number.
        while (current != 0) {
            if (dividend >= denom) {
                dividend -= denom;
                answer |= current;
            }
            current >>= 1;
            denom >>= 1;
        }
        return answer;
    }



    public static int divideWithoutOperator(int dividend, int divisor) {
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
