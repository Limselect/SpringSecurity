public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * @param a first number
     * @param b second number
     * @return sum of two numbers
     */
    public static int add(int a, int b) {
        System.out.println("Sum: "+(a+b));
        return a + b;
    }

    /**
     * @param a first number
     * @param b second number
     * @return difference of two numbers
     */
    public static int subtract(int a, int b) {
        System.out.println("Difference: "+(a-b));
        return a - b;
    }

    /**
     * @param a first number
     * @param b second number
     * @return product of two numbers
     */
    public static int multiply(int a, int b) {
        System.out.println("Product: "+(a*b));
        return a * b;
    }

    /**
     * @param a first number
     * @param b second number
     * @return division of two numbers
     */
    public static double divide(int a, int b) {
        System.out.println("Quotient: "+(a/b));
        return (double) a / b;
    }

}
