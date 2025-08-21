import java.util.Scanner; 
public class functAvg {
    public static int average(int a, int b, int c) {
        return (a+b+c) / 3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int avg = average(num1, num2, num3);
        System.out.println("The average is: " + avg);
        scanner.close();
    }
}
