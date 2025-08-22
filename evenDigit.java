public class evenDigit{
   public static int evenCount(int[] arr){
      int count=0;
      for(int num:arr){
         int digitCount = 0;
         while (num > 0) {
            digitCount++;
            num /= 10;
         }
         if (digitCount % 2 == 0) {
            count++;
         }
      }
      return count;
   }
   public static void main(String[] args) {
      int[] arr = {454, 7478, 8, 4, 877, 49, 34412, 28, 563897};
      System.out.println(evenCount(arr));
   }
}