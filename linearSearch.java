
public class linearSearch {
   public static void main(String[] args) {
      int[] arr = {45, 78, 48, 47, 87, 49, 34, 28, 56, 89};
      int target = 47;
      System.out.println(search(arr, target));-
   }
   public static int search(int[] arr, int target) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == target) {
            return i;
         }
      }
      return -1;
   }
}
