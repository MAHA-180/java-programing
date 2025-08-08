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

