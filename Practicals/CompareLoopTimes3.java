import java.time.LocalDateTime;

public class CompareLoopTimes3
{
   public static void main(String[] args)
   {
      int startTime, endTime;
      final int REPEAT = 100000000;
      final int FACTOR = 1000000;
      LocalDateTime now;
      now = LocalDateTime.now();
      startTime = now.getNano();
      for(int x = 0; x <= REPEAT; ++x);
      now = LocalDateTime.now();
      endTime = now.getNano();
      System.out.println("Time with prefix increment: " +
         (Math.abs(endTime - startTime) / FACTOR) + " milliseconds");
      now = LocalDateTime.now();
      startTime = now.getNano();
      for(int x = REPEAT; x >= 0; --x);
      now = LocalDateTime.now();
      endTime = now.getNano();
      System.out.println("Time with postfix increment: " +
         (Math.abs(endTime - startTime) / FACTOR) + " milliseconds");
   }
}
