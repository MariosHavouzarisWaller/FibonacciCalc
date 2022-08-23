import java.math.BigInteger;

public class FibonacciCalc {

    public static void main(String[] args) {
        fibNum();
    }

    public static void fibNum () {
        // Initialisation of BigInteger variables (also known as an abomination)
        BigInteger x1 = new BigInteger("0");
        BigInteger x2 = new BigInteger("1");
        BigInteger x3 = new BigInteger("0");
        System.out.println(x1 + "\n" + x2); // Print out first 2 variables
        // For loop for Fibonacci algorithm calculation
        for (int i = 0; i < 100; i++) {
            x3 = x1.add(x2);    // This too is also known as an abomination
            x1 = x2;
            x2 = x3;
            System.out.println(x3);
        }
    }
}
