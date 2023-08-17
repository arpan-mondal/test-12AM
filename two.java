import java.util.*;
public class BasketballScoreTrackerSystummm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tScore = 0;
        
        System.out.println("Welcome to the Basketball Score Tracker Systummm!");
        System.out.println("Enter the scores for each game (enter -1 to end):");
        
        int gNum = 1;
        while (true) {
            System.out.print("Game " + gNum + " score (-1 to finish): ");
            int score = scanner.nextInt();
            
            if (score == -1) {
                break;
            }
            
            tScore += score;
            gNum++;
        }
        
        System.out.println("Total points scored by the team: " + tScore);
    }
}

/* 
-----------------------OUTPUT--------------------

  Welcome to the Basketball Score Tracker Systummm!
Enter the scores for each game (enter -1 to end):
Game 1 score (-1 to finish): 50
Game 2 score (-1 to finish): 50
Game 3 score (-1 to finish): -1
Total points scored by the team: 100
  */
