
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
OUTPUT:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 10 


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

OUTPUT:
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

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
OUTPUT:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 

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

OUTPUT:
1 
4 9 
16 25 36 
49 64 81 100 
121 144 169 196 225 
256 289 324 361 400 441

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

OUTPUT:
2  
4  6  
8  10  12  
14  16  18  20  
22  24  26  28  30  
32  34  36  38  40  42  



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
OUTPUT:
1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 1 
    
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
OUTPUT:
   1 
  2 2 
 3 3 3 
4 4 4 4 



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
OUTPUT:
   1  
  2  3  
 4  5  6  
7  8  9  10  


#number pattern
public class Main {
    public static void main(String[] args) {
        int n = 6;  
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); 
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

OUTPUT:
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 



#diamond shape
public class Main {
    public static void main(String[] args) {
        int n = 5;

      
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        
            if (i == n) {
                for (int s = 1; s <= n - i; s++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

      
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

OUTPUT:
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 



#parallel 2
public class DoublePyramid {
    public static void main(String[] args) {
        int n=6; 
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++) 
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) 
            {
                System.out.print("* ");
            }

            for (int j=1;j<=(n-i)*2;j++) 
            {
                System.out.print(" ");
            }

            for (int k=1;k<=i;k++) 
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

OUTPUT:
     *            *
    * *          * *
   * * *        * * *
  * * * *      * * * *
 * * * * *    * * * * *
* * * * * *  * * * * * *
