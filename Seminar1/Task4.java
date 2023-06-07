import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public int[] createArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array that is to be created:: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array ::");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }

    public static int[] diffArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {

            throw new RuntimeException("Массивы не одинаковой длины");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i]==0) {throw new RuntimeException("Деление на 0!");}
            else{result[i] = arr1[i] / arr2[i];}

            }
        return result;
    }

    public static void main(String args[]) {
        Task3 obj = new Task3();
        int arr1[] = obj.createArray();
        int arr2[] = obj.createArray();

        System.out.println("Array created is :: " + Arrays.toString(arr1));
        System.out.println("Array created is :: " + Arrays.toString(arr2));
        int[] result = diffArrays(arr1, arr2);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        }

    }

}


