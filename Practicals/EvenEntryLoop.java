import java.util.Scanner;

public class EvenEntryLoop
{
    public static void main(String args[])
    {
        final int SENTINEL = 999;
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        while (input!=SENTINEL)
        {
            System.out.println("Please enter an even number. Enter 999 to exit: ");
            input = scanner.nextInt();
            if(input == 999)
                break;
            if(input%2 == 0)
                System.out.println("Good job!");
            else
                System.out.println("Number was not even. Try again.");
        }

    }
}
