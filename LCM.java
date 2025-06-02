import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        lcm(a, b);
    }

    public static void lcm(int a, int b) {
        int i = 1;
        while (i <= b) {
            int factor = a * i;
            if (factor % b == 0) {
                System.out.println("The lcm of " + a + " and " + b + " is " + factor);
                break;
            }
            i++;
        }
    }
}
