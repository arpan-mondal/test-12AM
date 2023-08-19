import java.util.Arrays;
public class SecondSmallestScore {
 public static int findSecondSmallest(int[] scores) {
   Arrays.sort(scores);
    return scores[1]; }
 public static void main(String[] args) {
    int[] scores = {10, 4, 5, 9, 2};
    int secondSmallestScore = findSecondSmallest(scores);
    System.out.println("The second smallest score is: " + secondSmallestScore); }}


/*
-------------OUTPUT-----------
  The second smallest score is: 4
  */
