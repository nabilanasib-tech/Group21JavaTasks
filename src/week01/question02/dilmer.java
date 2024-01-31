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

}
