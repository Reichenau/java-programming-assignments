/*
Типы данных и операторы -> Классы-оболочки -> Практика 1
Практика #1
Приведите примеры использования методы decode().
*/
package types_and_operators.wrapper_classes.practice01;

public class Main {
    public static void main(String[] args) {
        // 1. Обычное десятичное число
        Integer decimal = Integer.decode("12345");
        System.out.println("Обычное число (12345) -> " + decimal);


        // 2. Шестнадцатеричное число
        Integer hex1 = Integer.decode("0xFF");
        Integer hex2 = Integer.decode("#FF");

        System.out.println("Hex (0xFF) -> " + hex1);
        System.out.println("Hex (#FF) -> " + hex2);


        // 3. Восьмеричное число
        Integer octal = Integer.decode("010");
        System.out.println("Octal (010) -> " + octal);


        // 4. Отрицательные числа
        Integer negative = Integer.decode("-10");
        System.out.println("Отрицательное (-10) -> " + negative);

    }
}