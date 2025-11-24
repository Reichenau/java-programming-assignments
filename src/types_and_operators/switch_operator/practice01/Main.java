/*
Типы данных и операторы -> Оператор выбора -> Практика 1
Практика #1
Какого типа может быть переменная в switch?
Приведите примеры для всех возможных случаев.
*/
package types_and_operators.switch_operator.practice01;

public class Main {

    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {

        // --- Примитивы ---
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("Число 1");
                break;
            case 2:
                System.out.println("Число 2");
                break;
            default:
                System.out.println("Другое число");
        }


        // --- Симвлы ---
        char letter = 'B';

        switch (letter) {
            case 'A':
                System.out.println("Буква А");
                break;
            case 'B':
                System.out.println("Буква В");
                break;
        }


        // --- Строки ---
        String command = "START";

        switch (command) {
            case "START":
                System.out.println("Запуск...");
                break;
            case "STOP":
                System.out.println("Остановка...");
                break;
            default:
                System.out.println("Неизвестная команда");
        }


        // --- Enum ---
        Color myColor = Color.GREEN;

        switch (myColor) {
            case RED:
                System.out.println("Красный");
                break;
            case GREEN:
                System.out.println("Зеленый");
                break;
            case BLUE:
                System.out.println("Синий");
                break;
        }
    }
}