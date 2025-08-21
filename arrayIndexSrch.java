import java.util.Scanner;
public class arrayIndexSrch {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int n = sc.nextInt();
      int[] arr=new int[n];
      System.out.println("enter the elements of array");
      for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
      }
      System.out.print("Enter the element to search: ");
      int num =sc.nextInt();
      for(int i=0; i<arr.length;i++){
         if(arr[i]==num){
            System.out.println("Element found at index: " + i);
            break;
         }
         if(i == arr.length - 1) {
            System.out.println("Element not found in the array.");
         }
      }
      sc.close();


   }
}
