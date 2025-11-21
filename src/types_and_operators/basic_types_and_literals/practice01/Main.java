/*
Типы данных и операторы -> Базовые типы данных и литералы -> Практика 1
Практика #1
Приведите примеры для всех типов данных. Примеры должны также включать нулевые значения.
*/
package types_and_operators.basic_types_and_literals.practice01;

public class Main {
    public static void main(String[] args) {
        // --- Примитивные типы ---

        // 1. Целые числа
        byte myByte = 100;          // от -128 до 127
        short myShort = 30000;      // от -32768 до 32767
        int myInt = 1000000;        // от -2147483648 до 2147483647
        long myLong = 9999999999L;  // от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807

        // 2. Дробные числа
        float myFloat = 10.5f;      // от -3.4*10^38 до 3.4*10^38
        double myDouble = 8.5;      // от  ±4.9*10^-324 до ±1.7976931348623157*10^308

        // 3. Символ
        char myChar = 'Z';          // от 0 до 65535

        // 4. Логический тип
        boolean myBoolean = true;   // true или false


        // --- Ссылочные типы ---
        String myString = "Привет, Мир!";

        // --- Нулевые значния ---

        int zeroInt = 0;            // 0 или 0L
        byte zerobyte = 0;          // 0 или 0L
        short zeroShort = 0;        // 0 или 0L
        long zeroLong = 0;          // 0 или 0L

        double zeroDouble = 0.0;    // 0.0
        float zeroFloat = 0.0f;     // 0.0

        char zeroChar = 0;          // '\u0000'
        boolean zeroBool = false;

        String emptyString = null;  // null

        System.out.println("Byte: " + myByte);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);

        System.out.println("Zero Int: " + zeroInt);
        System.out.println("Null String: " + emptyString);
    }
}