class ReverseArray {

  public static void main(String[] args) {
    
    String[] can = {"Snickers", "Kitkat", "Eclairs", "Pulse", "Kismi"};

    // Reversing the order of candies
    int n = can.length;
    for (int i = 0; i < n / 2; i++) {
      String temp = can[i];
      can[i] = can[n - 1 - i];
      can[n - 1 - i] = temp;
    }

    // Print the reversed list of candies.
    System.out.println("Sarah's favorite candies in reverse order:");
    for (String candy : can) {
      System.out.println(candy + "   ");
    }
  }
}

/* 
------------------------------------------OUTPUT---------------------------------------------
Sarah's favorite candies in reverse order:
Kismi   
Pulse   
Eclairs   
Kitkat   
Snickers   */
