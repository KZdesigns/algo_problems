import java.util.*;

class Program {
   public static List<Integer> spiralTraverse(int[][] array) {
   
      ArrayList<Integer> spiral = new ArrayList<Integer>();
      int totalElements = array[0].length * array.length;
   	
      int top = 0;
      int rightEdge = array[0].length - 1;
      int bottom = array.length - 1;
      int leftEdge = 0;
   	
      int direction = 0;
      int i;
   	
      while(spiral.size() < totalElements) {
         if(direction == 0) {
         	//top
            for(i = top; i <= rightEdge; i++) {
               spiral.add(array[top][i]);
            }
            top++;
         }
      	
         if(direction == 1) {
         	//rightEdge
            for(i = top; i <= bottom; i++) {
               spiral.add(array[i][rightEdge]);
            }
            rightEdge--;
         }
      	
         if(direction == 2) {
         	//bottom
            for(i = rightEdge; i >= leftEdge; i--) {
               spiral.add(array[bottom][i]);
            }
            bottom--;
         }
      	
         if(direction == 3) {
         	//leftEdge
            for(i = bottom; i >= top; i--) {
               spiral.add(array[i][leftEdge]);
            }
            leftEdge++;
         }
      	
         direction++;
         direction = direction % 4;
      }
   	
      return spiral;
   }
}
