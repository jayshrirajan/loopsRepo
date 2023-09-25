package loops;

import java.util.Scanner;

public class cosine {
	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the value of x: ");
	        double x = scanner.nextDouble();

	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        double result = computeCos(x, n);
	        System.out.println("cos(" + x + ") = " + result);

	        scanner.close();
	    }

	    public static double computeCos(double x, int n) {
	        double cosX = 1;
	        int sign = -1;
	        int factorial = 2;

	        for (int i = 2; i <= n; i += 2) {
	            cosX += sign * Math.pow(x, i) / factorial;
	            sign *= -1;
	            factorial *= (i + 1) * (i + 2);
	        }

	        return cosX;
	    

		
	}

}
//Write a program to compute the cosine of x. The user should supply x and a positive integer n. 
//We compute the cosine of x using the series and the computation should use all terms in the series up 
//through the term involving xn
//
//cos x = 1 - x2/2! + x4/4! - x6/6! .....
//

//Write a program to print following :
//
//	 
//
//i)
//
//**********
//**********
//**********
//**********
//
//ii)
//
//*
//**
//***
//****
//*****
//
//iii)
//
//        *
//      **
//    ***
//  ****
//*****
//
// 
//
//iv)
//
//        *
//      ***
//    *****
//  *******
//*********
//
//v)
//
//        1
//      222
//    33333
//  4444444
//555555555
//
//vi)
//
//        1
//      212
//    32123
//  4321234
//543212345

//public class PatternPrinter {
//    public static void main(String[] args) {
//        // Pattern i)
//        System.out.println("i)\n");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        // Pattern ii)
//        System.out.println("\nii)\n");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        // Pattern iii)
//        System.out.println("\niii)\n");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        // Pattern iv)
//        System.out.println("\niv)\n");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        // Pattern v)
//        System.out.println("\nv)\n");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        
//        // Pattern vi)
//        System.out.println("\nvi)\n");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = i; k >= 1; k--) {
//                System.out.print(k);
//            }
//            for (int l = 2; l <= i; l++) {
//                System.out.print(l);
//            }
//            System.out.println();
//        }
//    }
//}
//

