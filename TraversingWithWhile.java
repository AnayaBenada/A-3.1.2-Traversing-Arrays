/*
 * Activity 3.1.2 - Steps 10 and 11
 * Step 10: while (goals[i] >= 1) stops at Game 2.
 * Step 11: while (goals[i] == 0) prints nothing, since goals[0] is 1.
 */
public class TraversingWithWhile
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int i = 0;
    while (goals[i] >= 1)
    {
      System.out.println("Game " + (i + 1) + ": " + goals[i]);
      i++;
    }
  }
}
