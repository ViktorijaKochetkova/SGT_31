package HomeWork;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Name+age
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("please enter your date of birth");
        int year = scanner.nextInt();
        int age = 2022 - year;
        System.out.println("your name is " + name + " and you are " + age + " year old");

        //Speed
        System.out.println("Please enter speed in mp/h");
        float speed = scanner.nextFloat();
        float speed2 = speed * 1.6f;

        System.out.println(speed + "mp/h in km/h would be equal to " + speed2 + "km/h" );
        }
}
