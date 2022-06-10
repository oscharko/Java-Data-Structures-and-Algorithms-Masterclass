package Recursion;

public class RecursiveVsIterativeSolution {

    // Recursive Solution
    static int powerOfTwo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2*powerOfTwo(n-1);
        }
    }

    // Iterative Solution
    static int powerOfTwoIT(int n) {
        var i = 0;
        var power = 1;
        while (i < n) {
            power = power * 2;
            i++;
        }
        return power;
    }
}
