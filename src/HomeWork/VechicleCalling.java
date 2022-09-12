package HomeWork;

import java.util.Scanner;

public class VechicleCalling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in the vehicle");
        int passengers = scanner.nextInt();

        Vechicle vechicle = new Vechicle(fuel,fuelUsage,passengers);
        System.out.printf( "EYoudslknfbfb %.2f kilome", vechicle.maxDistance());

        System.out.println();
        System.out.println(vechicle.maxDistance(100,4.7f,4));
    }
}
