/*
Классы и методы -> Методы с переменным числом параметров -> Практика 1
Практика #1
Приведите примеры класса, в котором перегружен метод с переменным числом параметров.
*/
package classes_and_methods.varargs.practice01;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Вызов с int ---");
        printContent(1, 2, 3, 4, 5);

        System.out.println("\n--- 2. Вызов с String ---");
        printContent("Java", "Python", "C++");

        System.out.println("\n--- 3. Вызов с (String, int) ---");
        printContent("Числа:", 7, 77, 777);

    }

    // --- Принимает целые числа ---
    public static void printContent(int... numbers) {
        System.out.print("Метод (int): ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // --- Принимает строки ---
    public static void printContent(String... words) {
        System.out.print("Метод (String): ");
        for (String s : words) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // --- Смешанная перегрузка ---
    public static void printContent(String header, int... numbers) {
        System.out.print("Метод (String, int): " + header);
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}