public class findNum{
   public static int evenCount(int[] arr) {
      int count = 0;
      for (int num : arr) {
         if (num % 2 == 0) {
            count++;
         }
      }
      return count;
   }
   public static int oddCount(int[] arr) {
      int count = 0;
      for (int num : arr) {
         if (num % 2 != 0) {
            count++;
         }
      }
      return count;
   }
   public static void main(String[] args) {
      int[] arr = {45, 78, 48, 47, 87, 49, 34, 28, 56};
      System.out.println( evenCount(arr));
      System.out.println( oddCount(arr));
      
   }
}
