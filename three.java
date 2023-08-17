import java.util.Arrays;
public class HTemp {
  public static void main(String[] args) {
       int[] temp = {32, 69, 78, 90, 81, 5, 71};
         //initialize 
         int hTemp = temp[0];

         //round-roung ghumo array ke andar
         for (int i = 1; i < temp.length; i++) {
           // udpate workshop of the code
            if (temperatures[i] > hTemp) {
                hTemp = temp[i];
            }
        }
        // output workshop
        System.out.println("The highest temperature is " + hTemp);
    }
}

/* 
-----------------OUTPUT------------------
  The highest temperature is 90
*/
