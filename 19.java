import java.util.*;

public class RearrangeChips {

  public static int[] rearrangeChips(int[] chips) {
    // Create two empty lists to store the positive and negative chips.
    List<Integer> positiveChips = new ArrayList<>();
    List<Integer> negativeChips = new ArrayList<>();

    // Iterate over the chips.
    for (int chip : chips) {
      if (chip >= 0) {
        positiveChips.add(chip);
      } else {
        negativeChips.add(chip);
      }
    }

    // Combine the two lists.
    int[] rearrangedChips = new int[chips.length];
    int i = 0;
    for (int chip : positiveChips) {
      rearrangedChips[i++] = chip;
    }
    for (int chip : negativeChips) {
      rearrangedChips[i++] = chip;
    }

    return rearrangedChips;
  }

  public static void main(String[] args) {
    // Create an array of chips.
    int[] chips = {1, 2, -3, 4, -5};

    // Rearrange the chips.
    int[] rearrangedChips = rearrangeChips(chips);

    // Print the rearranged array of chips.
    for (int chip : rearrangedChips) {
      System.out.print(chip + " ");
    }
  }
}

/*
-----------OUTPUT------------

  1 2 4 -3 -5 
  */
