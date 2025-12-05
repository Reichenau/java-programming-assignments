/*
Исключения и ошибки -> Способы обработки исключений -> Практика 1
Практика #1
Приведите пример кода с генерацией двух исключений,
одно из которых будет "перхвачено", а другое приведет к аварийной остановке.
*/
package exceptions_and_errors.exception_handling.practice01;

public class Main {
    public static void main(String[] args) {

        // Перехват исключения
        try {
            System.out.println("Деления на ноль:");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Перехват ошибки: деление на ноль");
        }

        System.out.println("\nПродолжение работы программы");


        // Неперехваченное исключение
        System.out.println("Создаем ошибку");

        int[] numbers = {1, 2, 3};
        int crash = numbers[10];

        System.out.println("Это сообщение не напечатается");
    }
}