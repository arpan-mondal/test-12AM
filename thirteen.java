class HeightSorter {
    public static void main(String[] args) {
         int[] cHeights = { 169, 115, 170, 128, 143 }; //in cm
        sortHeights(cHeights);
        System.out.println("Sorted heights from shortest to tallest:");
        for (int height : cHeights) {
            System.out.print(height + " ");}}
    public static void sortHeights(int[] heights) {
      int n = heights.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    // Swap heights[j] and heights[j + 1]
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;}}}}}

/*
-----------OUTPUT------------
  Sorted heights from shortest to tallest:
110 125 130 140 150 
*/
