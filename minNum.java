public class minNum {
   public static void main(String[] args) {
      int[] arr = {45, 78, 48, 47, 87, 49, 34, 28, 56, 89,12};
      System.out.println(findMin(arr));
   }
   public static int findMin(int[] arr){
      if(arr.length == 0) {
         return Integer.MAX_VALUE; // or throw an exception
      }
      int min = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] < min) {
            min = arr[i];
         }
      }
      return min;
   }
}
