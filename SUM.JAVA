import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to sum? ");
        int count = scanner.nextInt();

        int sum = 0;
        System.out.println("Enter " + count + " numbers:");

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}


OUTPUT:
How many numbers do you want to sum? 5
Enter 5 numbers:
2
60
6000
3050
850
Sum = 9962
