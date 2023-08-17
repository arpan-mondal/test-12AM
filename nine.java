class Array_Reverser {
    public static void main(String[] args) {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 14, 69 }; 
        reverseArray(seq);
        System.out.println("Reversed sequence:");
        for (int num : seq) {
            System.out.print(num + " ");
        }}
public static void reverseArray(int[] ar) {
        int start = 0;
        int end = ar.length - 1;
            while (start < end) {
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;}}}
/*
-------------OUTPUT--------------------
  Reversed sequence:
69 14 7 6 5 4 3 2 1 */
