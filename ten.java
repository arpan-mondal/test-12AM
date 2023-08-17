import java.util.HashSet;
class DuplicateCoinRemover {
    public static void main(String[] args) {
        int[] coins = { 6, 11, 16, 11, 21, 6, 26, 31, 16 };
        int[] uniqueCoins = removeDuplicates(coins);
        System.out.println("Coins after removing duplicates:");
        for (int coin : uniqueCoins) {
            System.out.print(coin + " "); }}
    
    public static int[] removeDuplicates(int[] coins) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        //unique set a add korchi 
        for (int coin : coins) {
            uniqueSet.add(coin); }
            //Size same korar jonno 
         int[] uniqueCoins = new int[uniqueSet.size()];
        int index = 0;
        //assign korchi uni value gulo nia to uni array 
        for (int coin : uniqueSet) {
            uniqueCoins[index++] = coin;}
        return uniqueCoins;  }}


/*
--------------OUTPUT-----------------
  Coins after removing duplicates:
16 21 6 26 11 31 */
  
