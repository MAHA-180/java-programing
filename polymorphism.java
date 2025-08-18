class Vehicle {
    public void drive() {
        System.out.println("drive");
    }
}
class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("driving bike");
    }
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("driving car");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.drive();   
        Vehicle a = new Car();
        a.drive();   
        Vehicle b = new Vehicle();
        b.drive();
    }
}
OUTPUT:
driving bike
driving car
drive

#bank
class Payment {
    public void payment() {
        System.out.println("Payment");
    }
}
class UPI extends Payment {
    @Override
    public void payment() {
        System.out.println("UPI Payment");
    }
}
class Banktransfer extends Payment{
    @Override
    public void payment() {
        System.out.println("Bank Transfer Payment");
    }
}
class Creditcard extends Payment{
    @Override
    public void payment() {
        System.out.println("Credit card Payment");
    }
}
public class Main {
    public static void main(String[] args) {
        Payment v = new UPI();
        v.payment();
        Payment a = new Banktransfer();
        a.payment();
        Payment c = new Creditcard();
        c.payment();
        Payment b = new Payment();
        b.payment();
    }
}
OUTPUT:
UPI Payment
Bank Transfer Payment
Credit card Payment
Payment
