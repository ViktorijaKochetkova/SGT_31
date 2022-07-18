import java.util.Scanner;
import java.util.SortedMap;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number:");
       int number = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int number2 = scanner.nextInt();
        System.out.println("Enter 3rd number:");
        int number3 = scanner.nextInt();
        if (number > number2 && number > number3){
            System.out.println("The greatest is:" + number);

        } else if (number2 > number && number2 > number3) {
            System.out.println("The greatest is:" + number2);

        } else if (number3 > number && number3 >number2){
            System.out.println("The greatest is:" + number3);

        }
        else {
            System.out.println("Please enter number");

        }


        System.out.println("Enter the year");
        int year = scanner.nextInt();
        boolean leap = true;
        if (year > 0){
            System.out.println( year + "Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
           System.out.println(year +" Leap Year");
        } else if (year % 400 == 0 ) {
            System.out.println(" Leap year");
        } else {
            System.out.println(" Not Leap year");


}

                    }
}
