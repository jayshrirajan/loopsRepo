package loops;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling {
	public static void main(String[] args) 
    {
        try (Scanner inFile = new Scanner(new FileReader("sample.txt"))) 
        {
            int num1 = inFile.nextInt();
            int num2 = inFile.nextInt();

            int sum = num1 + num2;

            System.out.println("sum " + sum);
        }
        catch (IOException | InputMismatchException ex) 
        {
            System.out.println("Error: " + ex.toString());
        }
    }

}

//Prior to Java SE 7, you can use a finally block to ensure that a resource is closed regardless of whether the 
//try statement completes normally or abruptly.

//In Java SE 7 or later you can use try-with-resources statement to ensure that each resource is closed 
//at the end of the statement. Following program explains this :


