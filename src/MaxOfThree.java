import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Maximum value is: " + max);
        sc.close();
    }
}
