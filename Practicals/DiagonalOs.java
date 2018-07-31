public class DiagonalOs
{
    public static void main(String args[])
    {
        final int INSTANCES = 10;
        String output = "";
        for(int i = 0; i < INSTANCES; i++)
        {
            for (int j = 0; j < i; j++)
                output += " ";
            output += "O";
            System.out.println(output);
            output = "";
        }
    }
}
