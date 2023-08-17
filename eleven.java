class TreasureMapFinder {
    public static void main(String[] args) {
        String[] items = {
            "Alur Chop", "Beguni", "Furuli", "Treasure Map", "Chop Silpo"
        }; 
        
        String tItem = "Treasure Map";
        int targetIndex = findItemIndex(items, tItem);
        if (targetIndex != -1) {
            System.out.println("Treasure map found at index: " + targetIndex);} 
            else {
            System.out.println("Treasure map not found among items.");
        }}
    public static int findItemIndex(String[] items, String target) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(target)) {
                return i;
            }}
        return -1;}}

/*
-------------OUTPUT------------------
  Treasure map found at index: 3
*/
