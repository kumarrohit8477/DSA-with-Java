public class BinarySearch {
   public static int binarySearch(int[] arr, int target){
      int start = 0;
      int end = arr.length - 1;
      
      while( start <= end){
         int mid = start + (end-start)/2;
         if(arr[mid]==target){
            return mid;
         }
         else if(arr[mid]<target){
            start = mid + 1;
         }
         else{
            end = mid - 1;
         }
      }
      return -1; // target not found
   }

   public static void main(String[] args) {
      int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
      int traget = 14;
      System.out.println(binarySearch(arr, traget));
   }
}
