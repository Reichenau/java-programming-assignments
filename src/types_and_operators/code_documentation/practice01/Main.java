/*
Типы данных и операторы -> Документирование кода -> Практика 1
Практика #1
Изучите утилиту javadoc и научитесь ею пользоваться.
*/
package types_and_operators.code_documentation.practice01;

/**
 * Первый класс с документацией
 * Разные теги Javadoc
 *
 * @author Daniel Shildt
 * @version 1.0
 */
public class Main {

    /**
     * Точка входа в программу
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int res = sum(5, 10);
        System.out.println("Сумма: " + res);

        printMessage("Проверка документации");
    }

    /**
     * Метод для сложения двух чисел
     *
     * @param a первое число
     * @param b второе число
     * @return результат сложения INT
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Просто выводит текст в консоль
     *
     * @param text строка, которую надо напечатать
     */
    public static void printMessage(String text) {
        System.out.println("Сообщение: " + text);
    }

    /**
     * Старый метод. Он мне больше не нужен
     * @deprecated вместо него используйте {@link #sum(int, int)}
     */
    @Deprecated
    public static void oldMethod() {
        System.out.println("Старье");
    }
}