import java.util.*;

public class IndianCityMerger {
    public static void main(String[] args) {
        String[] northCities = { "Delhi", "Jaipur", "Chandigarh", "Lucknow" };
        String[] southCities = { "Chennai", "Bangalore", "Hyderabad", "Kochi" };
        
        String[] mergedCities = mergeSortedIndianCities(northCities, southCities);
        
        System.out.println("Merged and sorted Indian city list:");
        for (String city : mergedCities) {
            System.out.println(city);
        }}
    
    public static String[] mergeSortedIndianCities(String[] cities1, String[] cities2) {
        int totalLength = cities1.length + cities2.length;
        String[] mergedCities = new String[totalLength];
        
        int i = 0, j = 0, k = 0;
        
        while (i < cities1.length && j < cities2.length) {
            if (cities1[i].compareTo(cities2[j]) < 0) {
                mergedCities[k++] = cities1[i++];
            } else {
                mergedCities[k++] = cities2[j++];}}
        
        while (i < cities1.length) {
            mergedCities[k++] = cities1[i++];}
        
        while (j < cities2.length) {
            mergedCities[k++] = cities2[j++];}
        
        return mergedCities;}}

/* 
----------OUTPUT--------------

  Merged and sorted Indian city list:
Chennai
Bangalore
Delhi
Hyderabad
Jaipur
Chandigarh
Kochi
Lucknow
  */
