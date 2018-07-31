public class CountByThrees
{
    public static void main(String args[])
    {
        final int INCREMENT = 3;
        final int MIN = 3;
        final int MAX = 300;
        final int NEWLINE = 30;
        String outputString = "";

        for(int i = MIN; i<=MAX; i+=INCREMENT)
        {
            outputString += i + " ";
            if(i%NEWLINE == 0)
                outputString += "\n";
        }

        System.out.println(outputString);
    }
}
