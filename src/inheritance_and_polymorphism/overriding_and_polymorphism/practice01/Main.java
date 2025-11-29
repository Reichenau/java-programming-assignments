/*
Наследование и полиморфизм -> Переопределение методов и полиморфизм -> Практика 1
Практика #1
Приведите пример перегруженных методов.
*/
package inheritance_and_polymorphism.overriding_and_polymorphism.practice01;

class Calculator {

    // --- Сложение двух целых чисел ---
    int sum(int a, int b) {
        return a + b;
    }

    // --- Перегрузка по количеству аргументов ---
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // --- Перегрузка по типу аргументов ---
    double sum(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("2 числа: " + calc.sum(10, 20));
        System.out.println("3 числа: " + calc.sum(10, 20, 30));
        System.out.println("Дробные: " + calc.sum(5.5, 4.5));
    }
}