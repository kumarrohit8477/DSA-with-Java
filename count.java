import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zeros = 0;
        int positiveNum = 0;
        int negativeNum = 0;
        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number == 0) {
                zeros++;
            } else if (number > 0) {
                positiveNum++;
            } else {
                negativeNum++;
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice != 'n' && choice != 'N');
        System.out.println("Total Zeros: " + zeros);
        System.out.println("Total Positive Numbers: " + positiveNum);
        System.out.println("Total Negative Numbers: " + negativeNum);
        sc.close();
    }
}