 class EvenNumberCounter {
    public static void main(String[] args) {
        int[] num = { 6, 9, 69, 20, 25, 30, 35 }; 
        int eC = countEvenNumbers(num);
        System.out.println("Number of even numbers in the array: " + eC);
    }
  public static int countEvenNumbers(int[] nums) {
        int eC = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                eC++;
            }}
        
        return eC;
    }}

/* 
-------------OUTPUT----------------------
  Number of even numbers in the array: 3
  */
