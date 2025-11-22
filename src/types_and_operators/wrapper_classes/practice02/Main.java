/*
Типы данных и операторы -> Классы-оболочки -> Практика 2
Практика #2
Приведите все способы создания экземпляра класса Boolean.
*/
package types_and_operators.wrapper_classes.practice02;

public class Main {
    public static void main(String[] args) {

        // 1. Autoboxing
        Boolean b1 = true;
        System.out.println("1. Autoboxing: " + b1);


        // 2. Статический метод valueOf
        Boolean b2 = Boolean.valueOf(true);
        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf("Yes");

        System.out.println("2. valueOf(boolean): " + b2);
        System.out.println("2. valueOf(String 'true'): " + b3);
        System.out.println("2. valueOf(String 'Yes'): " + b4);


        // 3. Использование констант
        Boolean b5 = Boolean.TRUE;
        Boolean b6 = Boolean.FALSE;
        System.out.println("3. Константа Boolean.TRUE: " + b5);


        // 4. Конструкторы
        Boolean b7 = new Boolean(true);
        Boolean b8 = new Boolean("true");

        System.out.println("4. Конструктор (Deprecated): " + b7);
        System.out.println("4. Конструктор String (Deprecated): " + b8);
    }
}