import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public int[] createArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Введите элемент массива: ");
        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }
    public static void diffArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw  new RuntimeException("Массивы не одинаковой длины");
        }else{
            int[] result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] - arr2[i];
            }
            System.out.println("Результирующий массив: "+Arrays.toString(result));
        }

        }


    public static void main(String args[]) {
        Task3 obj = new Task3();
        int arr1[] = obj.createArray();
        int arr2[] = obj.createArray();

        System.out.println("Первый массив: "+Arrays.toString(arr1));
        System.out.println("Второй массив: "+Arrays.toString(arr2));
        diffArrays(arr1, arr2);


    }

}

