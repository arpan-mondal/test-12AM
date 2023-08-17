class ProductCal {
    public static void main(String[] args) {
        double[] weights = { 2, 3, 1, 2, 2 }; 
        double product = WeightProduct(weights);
        
        System.out.println("Product of the weights: " + product);
    }
    
    public static double WeightProduct(double[] weights) {
      //I have reuse this code
        if (weights.length == 0) {
            throw new IllegalArgumentException("The array of weights is empty.");}
        double product = 1.0; 
        for (double weight : weights) {
            product *= weight; }
        return product;}}

/*
-------------OUTPUT-------------
  Product of the weights: 24.0
  */
