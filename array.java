







#normal
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String[] array={"sanzs","jazs","devi","pravee",
    "asmi","lali","arch"};
        array[1]="jazs";
        System.out.println(array[0]);
    }
}

#for 
class test
{
 public static void print(int[] array)
 {
 for(int i= 0; i < array.length; i++)
 System.out.println(array[i]);
 }
 public static void main(String [] args)
 {
 int[] myarray = {1, 2, 3, 4, 5};
 print(myarray);
 }
}

#if
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String[] array = {"devi", "pravee", "asmi", "lali", "arch", "maha"};
        array[1] = "arch"; 
        System.out.println(array[1]); 
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
            if (array[i].equals("asmi")) {
                array[i] = "lali";
            }
        }

        System.out.println("Updated array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
