import java.lang.Integer;

public class Task2 {
    public static void main(String args[]) {
        String arr[][] = {
                {"4e5", "67", "87"},
                {"23", "45", "78"},
                {"56", "45", "6о7"}
        };
        int result = method(arr);
        System.out.println(result);
    }
//    1. Ошибка компиляции: если вы не импортировали класс Integer и не указали
//    полный путь к методу parseInt, то компилятор не сможет найти этот метод и выдаст ошибку компиляции.
//
//     2. Ошибка выполнения: если элемент массива arr[i][j] не может быть преобразован в целое число,
//     то метод parseInt выбросит исключение NumberFormatException, которое не будет обработано в коде,
//     что приведет к ошибке выполнения.
//
//     3. Выход за пределы масива.


    public static int method(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                for (int j = 0; j < 5; j++) {
                    try {
                        int val = Integer.parseInt(arr[i][j]);
                        sum += val;
                    } catch (NumberFormatException e) {
                        System.err.println("Неправильный формат строки!");
                        break;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Выход за пределы массива");
                break;
            }

        }
        return sum;
    }
}


//    В этом коде мы добавили импорт класса Integer, обернули вызов метода parseInt в блок try-catch и обработали исключение NumberFormatException, выводя сообщение об ошибке в консоль.


