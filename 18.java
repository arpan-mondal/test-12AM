import java.util.*;

public class RotatePlayers {

  public static void rotatePlayers(String[] players, int steps) {
    int n = players.length;

    for (int i = 0; i < steps; i++) {
      String temp = players[0];
      for (int j = 0; j < n - 1; j++) {
        players[j] = players[j + 1];
      }
      players[n - 1] = temp;
    }
  }

  public static void main(String[] args) {
    String[] players = {"Aaron", "Bablu", "Carl", "David"};

    rotatePlayers(players, 2);

    System.out.println(Arrays.toString(players));
  }
}

/*
----------OUTPUT------------

  [Carl, David, Aaron, Bablu]
  */
