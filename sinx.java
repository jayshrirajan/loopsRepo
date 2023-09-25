package loops;

import java.util.Scanner;

public class sinx {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double result = computeSin(x, n);
        System.out.println("sin(" + x + ") = " + result);

        scanner.close();
    }

    public static double computeSin(double x, int n) {
        double sinX = 0;
        int sign = 1;
        int factorial = 1;

        for (int i = 1; i <= n; i += 2) {
            sinX += sign * Math.pow(x, i) / factorial;
            sign *= -1;
            factorial *= (i + 1) * (i + 2);
        }

        return sinX;
    }

	

}
//Write a program to compute sinx for given x. The user should supply x and a positive integer n. 
//We compute the sine of x using the series and the computation should use all terms in the series up through 
//the term involving xn
//
//sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
//
