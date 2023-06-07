import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task1 {
    public static void main(String[] args) {
        hereWillBeTrouble();

        hereWillBeTrouble2();

        hereWillBeTrouble3();

    }

    private static void hereWillBeTrouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a: ");
        int a = sc.nextInt();
        System.out.println("input b: ");
        int b = sc.nextInt();
        int oops;
        try {
            oops = a / b;
            System.out.println(oops);
        } catch (ArithmeticException e) {
            System.err.println("Что ты делаешь, говорили же не делить на ноль!");
        }
    }

    private static void hereWillBeTrouble2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input char: ");
        String str2 = sc.nextLine();
        int n;
        try {
            n = Integer.parseInt(str2);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }


    }

    private static void hereWillBeTrouble3() {
        int[] arr = {3, 5, 8, 0, 0, 43, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("input n: ");
        int n = sc.nextInt();
        try {
            System.out.println(arr[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Выход за пределы массива");
        }
    }

}





