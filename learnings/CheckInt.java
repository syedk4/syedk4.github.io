package learnings;

import java.util.Set;
import java.util.TreeSet;

public class CheckInt {
  public static void main(String[] args) {
    // Sequence of numbers with duplicate values and a missing number
    int[] sequence = {1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 9, 10};

    // Create a Set to store the numbers in the sequence
    Set<Integer> set = new TreeSet<Integer>();

    // Add each number to the Set
    for (int num : sequence) {
      set.add(num);
    }

    // Iterate through the Set and check if each number is one more than the previous number
    int previous = 0;
    for (int num : set) {
      // If a number is not one more than the previous number, it is the missing number
      if (num != previous + 1) {
        System.out.println("The missing number is: " + (previous + 1));
        break;
      }
      previous = num;
    }
  }
}

