
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("sum of all numbers:");
        for (int i = 0; i < count - 1; i++) {
            int sum = numbers[i] + numbers[i + 1];
            System.out.println(numbers[i] + " + " + numbers[i + 1] + " = " + sum);
        }
    }
}

OUTPUT:
How many numbers? 5
Enter 5 numbers:
500
35690
423
962
20
sum of all numbers:
500 + 35690 = 36190
35690 + 423 = 36113
423 + 962 = 1385
962 + 20 = 982
