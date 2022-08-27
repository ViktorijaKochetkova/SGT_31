package HomeWork;

import java.util.Arrays;
import java.util.Scanner;
public class HW28072 {
    public static void main(String[] args) {
        System.out.println(" Enter number:");
        Scanner scanner = new Scanner(System.in);
        int tree = scanner.nextInt();
        for (int i = 1; i <= tree; i++) {
            for (int j = 1; j <= tree - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


