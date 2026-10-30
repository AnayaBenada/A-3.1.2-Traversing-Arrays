/*
 * Activity 3.1.2 - Step 17
 * Corrected for loop algorithms.
 */
public class TraversalAlgorithmsFor
{
  public static void main(String[] args)
  {
    algorithm1();
    algorithm2();
    algorithm3();
    algorithm4();
  }

  public static void algorithm1()
  {
    int[] goals = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};

    for (int p = 1; p < goals.length; p++)   // fixed: was p = 0
    {
      if (goals[p-1] == 0)
      {
        System.out.println("Previous game had no goals!");
      }
    }
  }

  public static void algorithm2()
  {
    int[] goals = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};

    int sum = 0;
    for (int n = 0; n < goals.length; n++)   // fixed: was goals.length-1
    {
      sum += goals[n];
    }
    System.out.println("All goals: " + sum);
  }

  public static void algorithm3()
  {
    String[] misc = {"A", "B", "C", "D", "E", "F"};

    for (int j = misc.length - 1; j >= 0; j--)   // fixed: was j = misc.length; j > 0
    {
      System.out.print(misc[j] + " ");
    }
    System.out.println();
  }

  public static void algorithm4()
  {
    String[] misc = {"A", "B", "C", "D", "E", "F"};

    for (int skip = 1; skip < misc.length; skip += 2)   // fixed: was misc.length-2
    {
      System.out.print(misc[skip] + " ");
    }
    System.out.println();
  }
}
