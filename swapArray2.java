import java.util.Arrays;
public class swapArray2 {
   public static void main(String[] args) {
      int[] arr = {45,78,48,47,87,49,34,28,56,89};
      swap(arr);
      System.out.println(Arrays.toString(arr));
   }
   public static int[] swap(int[] arr){
      int start = 0;
      int end = arr.length - 1;  
      while (start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
      }
      return arr;
   }
   
}
