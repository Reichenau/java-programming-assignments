/*
Исключения и ошибки -> Иерархия исключений и ошибок -> Практика 2
Практика #2
Приведите примеры кода, в которых генерируются и обрабатываются следующие исключения.

- ArithmeticException
- ArrayIndexOutOfBoundsException
- IllegalArgumentException
- ClassCastException
- NullPointerException
*/
package exceptions_and_errors.hierarchy.practice02;

public class Main {
    public static void main(String[] args) {

        // 1. ArithmeticException (Деление на ноль)
        System.out.println("--- 1. ArithmeticException ---");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }


        // 2. ArrayIndexOutOfBoundsException (Выход за пределы массива)
        System.out.println("\n--- 2. ArrayIndexOutOfBoundsException ---");
        try {
            int[] numbers = {1, 2, 3};
            int error = numbers[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: в массиве нет такого индекса");
        }


        // 3. NullPointerException (Обращение к пустоте)
        System.out.println("\n--- 3. NullPointerException ---");
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Ошибка: пустая ссылка");
        }


        // 4. ClassCastException (Неверное приведение типов)
        System.out.println("\n--- 4. ClassCastException ---");
        try {
            Object text = "Я строка";
            Integer i = (Integer) text;
        } catch (ClassCastException e) {
            System.out.println("Ошибка: нельзя привести этот тип к int");
        }


        // 5. IllegalArgumentException (Неверный аргумент метода)
        System.out.println("\n--- 5. IllegalArgumentException ---");
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        System.out.println("Возраст установлен: " + age);
    }
}