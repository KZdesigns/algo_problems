import java.util.*;

class Program {

   public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
   
      int[] answers = new int[2];
      int top = 0;
      int bottom = 0;
      int current = Integer.MAX_VALUE;
      int SMD = Integer.MAX_VALUE;
      
      Arrays.sort(arrayOne);
      Arrays.sort(arrayTwo);
   
      while(top < arrayOne.length && bottom < arrayTwo.length) {
         
         int firstNum = arrayOne[top];
         int secondNum = arrayTwo[bottom];
           
           
         if(firstNum < secondNum) {
            current = Math.abs(firstNum - secondNum);
            top++;
         }else if(secondNum < firstNum) {
            current = Math.abs(firstNum - secondNum);
            bottom++;
         }else{
            return answers = new int[] {firstNum, secondNum};
         }
        
         
         if(SMD > current) {
            SMD = current;
            answers = new int[] {firstNum, secondNum};
         }  
         
      }
      return answers;
   }
}