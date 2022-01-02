import java.util.*;

/**
Kyle Zimmerman
Algo Expert Array-of-Products
*/


class Program {
   public static int[] arrayOfProducts(int[] array) {
   	
      int[] products = new int[array.length];
   	
      for(int i = 0; i < array.length; i++) {
      	
         int value = Program.left(array, i) * Program.right(array, i);
         products[i] = value;      	
      }
   	
      return products;
   }
   
   public static int left(int[] array, int i) {
      
      if(i == 0) {
         return 1;
      }
      
      int value = 1;
      
      for(int idx = i - 1; idx >= 0; idx--) {
         
         value = value * array[idx];
      
      }
   
      return value;
   }
   
   public static int right(int[] array, int i) {
   
      if(i == array.length - 1) {
         return 1;
      }
      
      int value = 1;
      
      for(int idx = i + 1; idx < array.length; idx++) {
         
         value = value * array[idx];
      
      }
   
      return value;
   
   }
}