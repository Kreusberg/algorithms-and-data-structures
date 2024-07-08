package academy.learnprogramming.algorithm.euclid;

/**
 * Euclid Algorithm<>BR>
 *      Calculates the Greatest Common Divisor between two numbers
 */
public class Euclid {

    // implementation using recursion
    public int gcd(int number, int divisor) {
        int remaining = (number % divisor);

        if (remaining != 0) {
            return gcd(divisor, remaining);
        } else {
            return divisor;
        }
    }

    // implementation without recursion
    public int gcd2(int number, int divisor) {
        while (divisor != 0) {
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;
        }
        return number;
    }
}
