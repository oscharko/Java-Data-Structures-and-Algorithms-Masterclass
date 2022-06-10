package Recursion;

public class Main {

    public static void main(String[] args) {
        Main recursion = new Main();
        var fac = recursion.factorial(3);
        var fib = recursion.fibonacci(4);
        System.out.println(fac);
        System.out.println(fib);
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public int fibonacci(int i) {
        if ( i <= 1) {
            return i;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }
}
