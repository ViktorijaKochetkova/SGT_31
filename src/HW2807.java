import java.util.Arrays;

public class HW2807 {
    public static void main(String[] args) {

        int[] array = {12, 56, 87, 75,67,90,53,68,77};
        int [] narray = new int [array.length];

        for (int i = 0; i < array.length; i++) {

        }
        System.out.println("Source Array: " + Arrays.toString(array));
        System.out.println("New Array : "+Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array [i];
            array [i] = array [array.length- 1 - i];
            array [array.length - 1 - i ] = temp;
        }
        System.out.print("Reverse Array: ");
        System.out.println(Arrays.toString(array));

        }
    }

