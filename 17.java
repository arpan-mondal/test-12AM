import java.util.*;
public class FruitFrequency {
public static void main(String[] args) {
    String[] fruits = {"apple", "banana", "apple", "orange", "banana"};
    Map<String, Integer> fruitCounts = new HashMap<>();
    for (String fruit : fruits) {
      if (fruitCounts.containsKey(fruit)) {
        fruitCounts.put(fruit, fruitCounts.get(fruit) + 1);
      } else {
        fruitCounts.put(fruit, 1);
      } }
for (String fruit : fruitCounts.keySet()) {
      System.out.println(fruit + ": " + fruitCounts.get(fruit)); }}}

/*
---------OUTPUT----------
  apple: 2
banana: 2
orange: 1
  */
