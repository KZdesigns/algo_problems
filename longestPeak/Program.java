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
          
      int currentPeakLength = 0;
      int longestPeakLength = 0;
      
      for(int i = 0; i < array.length; i++) {
      
         int leftCount = Program.checkLeft(i, array);
         int rightCount = Program.checkRight(i, array);
         
         if(leftCount >= 1 && rightCount >= 1) {
            currentPeakLength = 1 + leftCount + rightCount;
         }
         
         
         if(currentPeakLength >= 3 && currentPeakLength > longestPeakLength) {
            longestPeakLength = currentPeakLength;
         }
         
         currentPeakLength = 0;
      }
   
   
      return longestPeakLength; 
   }
   
   /**
   
   */
   public static int checkLeft(int i, int[] array) {
      
      int count = 0;
      
      if(i == 0) {
         return count;
      }
      
      while (i > 0) {
         int num1 = array[i];
         int num2 = array[i - 1];
         
         if(num1 > num2) {
            count++;
         } else {
            return count;
         }
      
         i--;
      }
      
      
      return count;
   }
   
   /**
   
   */
   public static int checkRight(int i, int[] array) {
   
      int count = 0;
      
      if(i == array.length - 1) {
         return count;
      }
      
      while (i < array.length - 1) {
         int num1 = array[i];
         int num2 = array[i + 1];
         
         if(num1 > num2) {
            count++;
         } else {
            return count;
         }
      
         i++;
      }
      
      
      return count;
   
   }

}


