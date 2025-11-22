/*
Типы данных и операторы -> Базовые типы данных и литералы -> Практика 8
Практика #8
Самостоятельно изучите, что означает Type Inference и приведите пример с использованием var.
*/
package types_and_operators.basic_types_and_literals.practice08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Пример со строкой
        var message = "Hello, World!";
        System.out.println("Значение: " + message);
        System.out.println("Тип: " + message.getClass().getSimpleName());


        // 2. Пример с числом
        var number = 100;
        System.out.println("Число: " + number);

        // 3. Сокрщения
        var scanner = new Scanner(System.in);

        System.out.println("Создан объект: " + scanner.getClass().getSimpleName());
    }
}