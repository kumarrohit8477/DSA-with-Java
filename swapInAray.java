import java.util.Arrays;
public class swapInAray {
   public static void main(String[] args) {
      int[] arr ={12, 34, 56, 78, 90};
      swap(arr, 1, 3);
      System.out.println(Arrays.toString(arr));
   }
   public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}
