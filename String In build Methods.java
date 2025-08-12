SYNTAX:

charAt:
 char ch = str.charAt(0);     
 System.out.println("The Character is:"+ch);

Before:
 char ch1 = (char) str.codePointBefore(3);
System.out.println("The Before Character is:"+ch1);

AT:
char ch2 = (char) str.codePointAt(4);
System.out.println("The After Character is:"+ch2);

Count:
int count = str.codePointCount(0, 5);
System.out.println("The Count is:"+count);

Compare:
int ch4=str.compareTo(str1);
System.out.println("Result:"+ch4);


EXAMPLE:
#return first,before,At
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String str = data.nextLine(); 
        char ch = str.charAt(0);     
        System.out.println("The Character is:"+ch);
        char ch1 = (char) str.codePointBefore(3);
        System.out.println("The Before Character is:"+ch1);
        char ch2 = (char) str.codePointAt(4);
        System.out.println("The After Character is:"+ch2);
        int count = str.codePointCount(0, 5);
        System.out.println("The Count is:"+count);
    }
}
OUTPUT:
Enter your Name:
MAHALAKSHMI
The Character is:M
The Before Character is:H
The After Character is:L
The Count is:5


#COMAPRE,COUNT
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter Name1:");
        String str = data.nextLine();
        System.out.println("Enter Name2:");
        String str1=data.nextLine();
        int ch3 = str.codePointCount(0, 4);
        System.out.println("The number is: " + ch3);
        int ch4=str.compareTo(str1);
        System.out.println("Result:"+ch4);
    
    }
}
OUTPUT:
Enter Name1:
MAHALAKSHMI
Enter Name2:
SATHIAVADIVELAN
The number is: 4
Result:-6
