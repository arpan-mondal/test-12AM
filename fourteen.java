class WordPalindromeChecker {
    public static void main(String[] args) {
        char[] word = { 'l', 'e', 'v', 'e', 'l' }; 
        boolean isPalindrome = checkWordPalindrome(word);
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");}}
    public static boolean checkWordPalindrome(char[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;}
            left++;
            right--;}
        
        return true; 
    }}
/*
---------OUTPUT--------
  The array is a palindrome.
*/
