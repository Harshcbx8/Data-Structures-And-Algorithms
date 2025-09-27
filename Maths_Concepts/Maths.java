package Maths_Concepts;

public class Maths {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    // Find the number of digits in a number
    public static int countDigits(int num) {
        return (int)(Math.log10(num) + 1);
    }
    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(5, 3));
        System.out.println("Multiplication: " + multiply(5, 3));
        System.out.println("Division: " + divide(5, 3));
        System.out.println("Number of digits in 123456: " + countDigits(12345));
        System.out.println(Math.log10(28721) + 1); // Special case for 0

        //BIT WISE MANIPULATION

        
        System.out.println(Integer.toBinaryString((11))); //11010
        //Check for a ODD number using AND Operator
        System.out.println((11 & 1)); //FALSE

        //Generate binary representation
        System.out.println(Integer.toBinaryString(26)); //11010
        System.out.println(Integer.toBinaryString(1<<3)); //1000

        //Find ith bit
        int i = 3; // Bit position to check
        System.out.println(Integer.toBinaryString(26 & (1 << i))); //1000
        System.out.println((26 & (1 << i))==0?"BIT IS ZERO": "BIT IS ONE"); // Check if ith bit is  1 OR 0

        //SWAP NUMBERS USING BITWISE XOR
        int x = 15, y = 10;
        System.out.println("Before Swap: x = " + x + ", y = " + y+" X:" + Integer.toBinaryString(x) + " Y:" + Integer.toBinaryString(y));
        x = x ^ y;
        System.out.println("After first XOR: x = " + x + ", y = " + y+" X:" + Integer.toBinaryString(x) + " Y:" + Integer.toBinaryString(y));
        y = x ^ y;
        System.out.println("After second XOR: x = " + x + ", y = " + y+" X:" + Integer.toBinaryString(x) + " Y:" + Integer.toBinaryString(y));
        x = x ^ y;
        System.out.println("After Swap: x = " + x + ", y = " + y+" X:" + Integer.toBinaryString(x) + " Y:" + Integer.toBinaryString(y));
    }
}
