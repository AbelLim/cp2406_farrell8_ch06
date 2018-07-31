public class Perfect
{
    public static void main(String args[])
    {
        final int START = 1;
        final int END = 1000;

        System.out.println("Perfect Numbers: ");
        for(int i=START; i<=END; i++)
        {
            if(isPerfect(i))
                System.out.println(i);
        }
    }

    public static boolean isPerfect(int number)
    {
        int sum = 0;
        for(int i = 1; i < number; i++)
        {
            if(number%i==0)
                sum+=i;
        }

        return (sum==number);
    }
}
