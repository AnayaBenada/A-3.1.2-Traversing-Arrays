/*
 * Activity 3.1.2 - Step 18
 * Corrected while loop algorithms.
 */
public class TraversalAlgorithmsWhile
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

    int index = 1;   // fixed: was 0
    while (index < goals.length)
    {
      if (goals[index-1] == 0)
      {
        System.out.println("Previous game had no goals!");
      }
      index++;
    }
  }

  public static void algorithm2()
  {
    int[] goals = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};

    int sum = 0;
    int i = 0;
    while (i < goals.length)
    {
      sum += goals[i];
      i++;   // fixed: added
    }
    System.out.println("All goals: " + sum);
  }

  public static void algorithm3()
  {
    String[] misc = {"A", "B", "C", "D", "E", "F"};

    int num = 0;
    while (num < misc.length-2)   // fixed: was misc.length-1
    {
      num++;
      System.out.print(misc[num] + " ");
    }
    System.out.println();
  }

  public static void algorithm4()
  {
    String[] misc = {"A", "B", "C", "D", "E", "F"};

    int j = 0;
    while (j < misc.length)
    {
      System.out.print(misc[j] + " ");   // fixed: was misc[j+2]
      j += 2;
    }
    System.out.println();
  }
}
