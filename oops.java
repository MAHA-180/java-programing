#
import java.util.Scanner;
class Main {
    int x=5;
    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println(obj.x);       
                  
        }
    }
Output:
5
#
class person{
    String n;
    public person(String n){
        this.n = n;
    }
    @Override 
    public String toString(){
        return "person{name:'" + n +"'}";
    }
    public static void main(String[] args){
        person p = new person("Maha");
System.out.println(p.toString());
    }
}
output:
person{name:'Maha'}
