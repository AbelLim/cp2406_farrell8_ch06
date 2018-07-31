import java.util.Scanner;

public class InBetween
{
    public static void main(String args[])
    {
        int integer1;
        int integer2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first integer.");
        integer1 = scanner.nextInt();
        System.out.println("Input the second integer.");
        integer2 = scanner.nextInt();

        if(integer1 < integer2)
            System.out.println(printIntegers(integer1,integer2));
        else if(integer1 > integer2)
            System.out.println(printIntegers(integer2,integer1));
        else
            System.out.println("There are no values between the two integers to print.");


    }

    public static String printIntegers(int min, int max)
    {
        String output = "";
        for(int i = min + 1; i < max; i++)
        {
            output += i + " ";
        }

        return output;
    }
}
