import java.util.Scanner;
public class inputArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements of array: ");
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
      }
      System.out.println("Sum of array elements: " + sum);
      sc.close();
   }
}
