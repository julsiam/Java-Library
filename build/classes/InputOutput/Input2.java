package InputOutput;

import java.util.Scanner;
public class Input2
       
{
    Scanner in = new Scanner(System.in);
    public double getNumber()
    {
        System.out.println("Enter a number: ");
        double a = in.nextDouble();
        return a;
    }
}