package Recursion.CrackingRecursionInterviewQuestions;

public class Main {
    public static void main(String[] args) {
        Main questions = new Main();
        var sod = questions.sumOfDigits(33);
        var bc = questions.sumBase(34, 6);
        var pow = questions.power(3,3);
        var gcd = questions.greatestCommonDivisor(16, 8);
        var dtb = questions.decimalToBinary(1111);
        System.out.println(sod);
        System.out.println(bc);
        System.out.println(pow);
        System.out.println(gcd);
        System.out.println(dtb);
    }

    // Question 1 Sum of Digits

    public int sumOfDigits(int n) {
        if (n <= 0)
            return 0;
        else
            return n%10 + sumOfDigits(n/10);
    }

    // Sum of Digits in Base K (from LeetCode)

    public int sumBase(int n, int k)
    {
        if (n <= 0) {
            return 0;
        } else {
            var num = Integer.parseInt(Integer.toString(Integer.parseInt(Integer.toString(n), 10), k));
            return num%10 + sumOfDigits(num/10);
        }

    }

    // Question 2 Power of

    public int power(int base, int exp) {
        if (exp < 2)
            return base;
        else
            return base * power(base, exp-1);
    }

    // Question 3 The Greatest Common Divisor

    public int greatestCommonDivisor(int a, int b) {
        if (a < 0 || b < 0)
            return -1;
        else if (b == 0)
            return a;
        else
            return greatestCommonDivisor(b, a%b);
    }

    // Question 4 Decimal-Number to Binary-Number

    public int decimalToBinary(int n) {
        if (n == 0)
            return 0;
        else
            return (n%2 + 10 * decimalToBinary(n/2));
    }
}
