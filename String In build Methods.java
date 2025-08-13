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

#regionMatches
public class Main {
    public static void main(String[] args) {
        String a="Hello Maha";
        String b="World Asmitha";
        String x = "Maha|Asmitha|rajesh";
        System.out.println("Maha".matches(x));
        System.out.println("Asmitha".matches(x));
        System.out.println("Java".matches(x));
        System.out.println(a.regionMatches(7,a,4,5));
    }
}
OUTPUT:
true
true
false
false

#replace,replaceALL,replaceFirst
public class Main {
    public static void main(String[] args) {
        String a="Hello";
        String b="Hello Maha Hello";
        System.out.println(a.replace('L','p'));
        String x="(?i)Hello";
        System.out.println(b.replaceAll(x,"Hi"));
        String y="Hello";
        System.out.println(b.replaceFirst(y,"Hi"));
    }
}

OUTPUT:
Heppo
Hi Maha Hi
Hi Maha Hello

#
public class Main {
    public static void main(String[] args) {
        String x="Hello World";
        String y="[,\\.\\s]";
        String[] z=x.split(y);
        for(String  s:z){
        System.out.print(s);
    }
}
}
OUTPUT:
HelloWorld

#SPLIT,CONCATE
 import java.util.Scanner;  
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = sc.nextLine();

        String y = "[\\.\\s]";  
        String[] z = x.split(y);

        String concatenated = "";

        System.out.println("Split parts:");
        for (String s : z) {
            System.out.println(s);
            concatenated += s;
        }

        System.out.println("Concatenated string: " + concatenated);
    }
}
OUTPUT:
Enter a string: HELLO WORLD
Split parts:
HELLO
WORLD
Concatenated string: HELLOWORLD

#startswith
 public class Main {
    public static void main(String[] args) {
        String a="Hello";
        System.out.println(a.startsWith("Hello"));
        System.out.println(a.startsWith("World"));
        System.out.println(a.startsWith("He"));
    }
}
OUTPUT:
true
false
true

#
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String x = "hello world";
        char[] y = x.toCharArray();   
        System.out.println(y[4]);    
    }
}
OUTPUT:
o

#
class Main {
    public static void main(String[] args) {
        String x = "hello world";
        char[] y = x.toCharArray();   

        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]); 
        }
    }
}
OUTPUT:
hello world

#Userinput
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String x = scanner.nextLine();          
        char[] y = x.toCharArray();
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);               
        }
        
        scanner.close();  
    }
}
output:
Enter a string: Hello world
Hello world

#
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String x = scanner.nextLine();          
            System.out.println(x); 
            System.out.println(x.trim()); 
            System.out.println(String.valueOf(x));    
                 
        }
    }
OUTPUT:
Enter a string:        Maha
       Maha
Maha
       Maha
