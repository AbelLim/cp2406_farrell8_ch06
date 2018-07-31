public class Factorals
{
    public static void main(String args[])
    {
        final int START = 1;
        final int END = 10;
        for(int i = START; i <= END; i++)
        {
            System.out.println(factorial(i));
        }
    }

    public static int factorial(int n)
    {
        if (n == 1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
