import java.util.*;

class Program {

   public static int firstDuplicateValue(int[] array) {
      
      for(int i = 0; i < array.length - 1; i++) {
         int value = array[i];
         
         if(value < 0) {
            return value * -1;
         }
         
         for(int j = i+1; j < array.length; j++) {
            if(array[i] == array[j]) {
               array[j] = array[j] * -1;
            }   
         }
      } 
      
      if(array.length <= 0) {
         return -1;
      }
      
      if(array[array.length-1] < 0) {
         return array[array.length-1];
      }
      
      return -1;
   }
}


