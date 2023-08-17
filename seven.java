public class ColorSwapper {
    public static void main(String[] args) {
        String[] colors = { "Red", "Green", "Blue", "Yellow", "Black" };
        // Swapping ho raha ha 
        swapFirstAndLast(colors);
        System.out.println("After swapping:" + " ");
        for (String c : colors) {
            System.out.println(c+ "  ");}}
    public static void swapFirstAndLast(String[] arr) {
        if (arr.length < 2) {
            // ye line copy kia ha maine 
            throw new IllegalArgumentException("The array should have at least two elements to perform the swap.");}
         String temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;}}

/*
--------------- OUTPUT ---------------
  After swapping: 
Black  Green  Blue  Yellow  Red  
  */

