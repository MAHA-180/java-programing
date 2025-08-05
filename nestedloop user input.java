import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper limit for outer loop (i): ");
        int outerLimit = sc.nextInt();

        System.out.print("Enter the upper limit for inner loop (j): ");
        int innerLimit = sc.nextInt();

        for (int i = 1; i <= outerLimit; i++) {
            System.out.println("Outer loop i = " + i);
            for (int j = 1; j <= innerLimit; j++) {
                System.out.println(i * j);
            }
        }

        sc.close();
    }
}
