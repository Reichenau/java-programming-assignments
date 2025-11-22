/*
Типы данных и операторы -> Базовые типы данных и литералы -> Практика 6
Практика #6
Приведите примеры сужающего преобразования типов.
*/
package types_and_operators.basic_types_and_literals.practice06;

public class Main {
    public static void main(String[] args) {
        // double -> int
        double myDouble = 99.99;
        int myInt = (int) myDouble;

        System.out.println("Double: " + myDouble);
        System.out.println("Int после преобразования: " + myInt);


        // int -> byte
        int largeNumber = 130;
        byte myByte = (byte) largeNumber;

        System.out.println("Int: " + largeNumber);
        System.out.println("Byte после преобразования: " + myByte);


        // int -> char
        int code = 65;
        char letter = (char) code;

        System.out.println("Код: " + code);
        System.out.println("Символ: " + letter);
    }
}