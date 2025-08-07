
#patterns

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n =10 ;

        for (int i = 1; i <=n; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print( j + " ");
            }
            System.out.println(); 
        }
    }
}

#reverse pattern
public class Main {
    public static void main(String[] args) {
        int n = 10;

        for (int i = n; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
#continuos numbers
public class Main {
    public static void main(String[] args) {
        int num = 1;      
        int n = 6;
        for (int i = 1; i <= n; i++) {    
            for (int j = 1; j <= i; j++) { 
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
#square values
public class Main {
    public static void main(String[] args) {
        int num = 1;      
        int n = 6;
        for (int i = 1; i <= n; i++) {        
            for (int j = 1; j <= i; j++) {    
                System.out.print((num * num) + " ");
                num++;
            }
            System.out.println();
        }
    }
}
#multiples of 2
public class Main {
    public static void main(String[] args) {
        int num = 1;      
        int n = 6;
        for (int i = 1; i <= n; i++) {       
            for (int j = 1; j <= i; j++) {    
                System.out.print((num * 2) + "  ");  
                num++;
            }
            System.out.println();
        }
    }
}

#remainder is 0 and 1
public class Main {
    public static void main(String[] args) {
        int num = 1;
        int n = 6;
        for (int i = 1; i <= n; i++) {        
            for (int j = 1; j <= i; j++) {    
                System.out.print((num % 2) + " ");  
                num++;
            }
            System.out.println();
        }
    }
}
#pyramid
public class Main {
    public static void main(String[] args) {
        int n = 4;  
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
#continous pyramid num
public class Main {
    public static void main(String[] args) {
        int num=1;
        int n=4  ;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "  ");
                 num++;
               
            }
            System.out.println();
            
        }
    }
}
#

