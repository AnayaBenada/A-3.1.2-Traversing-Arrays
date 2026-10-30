/*
 * Activity 3.1.2 - Step 7
 * Display goals in order from the last game to the first.
 */
public class TraverseBackwards
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

    for (int i = goals.length - 1; i >= 0; i--)
    {
      System.out.println("Game " + (i + 1) + ": " + goals[i]);
    }
  }
}
