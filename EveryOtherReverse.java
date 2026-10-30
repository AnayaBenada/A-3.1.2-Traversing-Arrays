/*
 * Activity 3.1.2 - Step 8
 * Display every other goal in reverse order.
 */
public class EveryOtherReverse
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

    for (int i = 0; i < goals.length; i++)
    {
      int index = i;
      int gameNumber = i + 1;
      if (i % 2 == 1) { // every other game goes backwards
        index = goals.length - 1 - i;
        gameNumber = goals.length - i + 1;
      }
      System.out.println("Game " + gameNumber + ": " + goals[index]);
    }
  }
}
