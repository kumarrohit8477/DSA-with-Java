public class maxVal {
   public static void main(String[] args) {
      int[] arr = {12, 34, 56, 718, 90};
      int max = findMax(arr);
      System.out.println("Maximum value in the array: " + max);
   }
   public static int findMax(int[] arr){
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }
      return max;
   }
}
