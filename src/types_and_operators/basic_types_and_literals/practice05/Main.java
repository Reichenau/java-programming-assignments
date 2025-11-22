/*
Типы данных и операторы -> Базовые типы данных и литералы -> Практика 5
Практика #5
Приведите примеры, когда арифметические операции выполняются с переменными различных типов. Объясните результат.
*/
package types_and_operators.basic_types_and_literals.practice05;

public class Main {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double

        // int и double
        int a = 10;
        double b = 2.5;
        // int автоматически расширяется до double, 10.0 + 2.5
        double res1 = a + b;
        System.out.println("int + double = " + res1 + " (Результат double)");


        // long и float
        long bigNum = 1000000L;
        float smallNum = 0.5f;
        // long расширяется до float, результат float
        float res2 = bigNum + smallNum;
        System.out.println("long + float = " + res2 + " (Результат float)");


        // byte и short
        byte x = 50;
        byte y = 50;

        // byte res3 = x + y; // выпадет ошибка компиляции
        // все, что меньше int, перед арифметикой превращается в int
        // Поэтому результат сложения двух байтов — это int.
        int res3 = x + y;
        System.out.println("byte + byte = " + res3 + " (Результат int)");
    }
}