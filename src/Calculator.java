import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        int operater;
        int n1,n2;
        System.out.println("1 - Add \n 2 - subtract \n 3 - multiply 4 - divide \n");
        System.out.print("chose operater: ");
        Scanner scanner = new Scanner(System.in);
        operater = scanner.nextInt();
        System.out.print("Enter first number : ");
        n1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        n2 = scanner.nextInt();

        int result = 0;
        switch(operater) {
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                result = n1 / n2;
                break;

            default:
                System.out.println("Entered oparetor is not valid");
        }
        System.out.print("Result is: " + result);
    }
}
