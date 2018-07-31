import java.util.Scanner;

public class CountByAnything
{
    public static void main(String args[])
    {
        int increment = 0;
        int count = 0;
        final int MIN = 3;
        final int MAX = 300;
        String outputString = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount to increase the count by: ");
        increment = scanner.nextInt();

        for(int i = MIN; i<=MAX; i+=increment)
        {
            outputString += i + " ";
            count++;
            if(count >= 10) {
                outputString += "\n";
                count = 0;
            }
        }

        System.out.println(outputString);
    }
}
