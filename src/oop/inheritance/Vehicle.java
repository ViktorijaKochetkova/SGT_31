package oop.inheritance;

public class Vehicle {
    //Fields
    protected String brand;
    //Methods
    public void honk(){
        System.out.println("Tuut tuut");
        System.out.println("My brand is:" + brand);
    }
}

class Bike extends Vehicle{
    public void honk(){
        System.out.println("Pff");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.honk();
        bike.brand = "volvo";
        bike.honk();
    }
}