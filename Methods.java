#SIMPLE
public class Main {
    public static void main(String[] args) {
        myMethod(); 
    }

    public static void myMethod() {
        System.out.println("MAHA");
    }
}

OUTPUT:
MAHA
  
#add 2 numbers
import java.util.Scanner;

public class Main {
    static void mymethod(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        mymethod(a, b); 
    }
}
OUTPUT:
Enter first number: 50
Enter second number: 60
110


#FIRST NAME LAST NAME
import java.util.Scanner;
public class Main {
    static void myMethod(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = data.next();
        System.out.print("Enter last name: ");
        String last = data.next();
        myMethod(first, last);
        
    }
}

OUTPUT:
Enter first name: MAHA
Enter last name: LAKSHMI
Full Name: MAHA LAKSHMI

#BIO
import java.util.Scanner;
public class Main {
    static void myMethod(String firstName, String lastName, int age, double height) {
         System.out.println("\n----BIO----");
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String first = data.next();
        System.out.print("Enter the last name: ");
        String last = data.next();
        System.out.print("Enter the Age: ");
        int age = data.nextInt();
        System.out.print("Enter the height: ");
        double height = data.nextDouble();
        myMethod(first, last, age, height);
        
    }
}
OUTPUT:
Enter the first name: MAHALAKSHMI
Enter the last name: S
Enter the Age: 19
Enter the height: 152.3

----BIO----
Full Name: MAHALAKSHMI S
Age: 19
Height: 152.3

#CALCULATOR FUNCTION:
import java.util.Scanner;

public class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = data.nextInt();
        System.out.print("Enter second number: ");
        int num2 = data.nextInt();
        System.out.print("Enter operation (+, -, *): ");
        char op = data.next().charAt(0);
        int result = 0;
        switch (op) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
           
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }
}

OUTPUT:
Enter first number: 5
Enter second number: 5
Enter operation (+, -, *): *
Result: 25


