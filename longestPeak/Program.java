/**
Kyle Zimmerman
Algo Expert Longest Peak
12/31/2021
*/


/*
a peak starts with a single number then next numbers are either consectively positive 
until reaching point of the peak and which the numbers following are conitnuely decreasing
*/

import java.util.*;

class Program {
   
   /**
   longestPeak calculates the longest consective "peak" within an array.
   @param array and integer array.
   @return and int value reps the longest peak in the array.
   */
   public static int longestPeak(int[] array) {
   
      for(int i = 0; i < array.length - 1; i++) {
         
         int num1 = array[i];
         int num2 = array[i+1];
         System.out.print("[" + num1 + "," + num2 + "]");
      
      }
   
   
      return -1;   
   }

}


