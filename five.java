class AverageTree {
    public static void main(String[] args) {
        double[] treeH = { 12.5, 15.2, 10.8, 18.6, 20.0, 14.3 }; 
        double averageH = cah(treeH);
        System.out.println("Average height of the trees: " + averageH + " meters");
    }
    public static double cah(double[] treeH) {
        if (treeH.length == 0) {
            throw new IllegalArgumentException("The array of tree heights is empty.");}
        double sum = 0.0;
        for (double height : treeH) {
            sum += height;}
        return sum / treeH.length; }}

/*
-------------OUTPUT--------------

  Average height of the trees: 15.233333333333333 meters
*/
