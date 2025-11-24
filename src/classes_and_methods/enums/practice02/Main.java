/*
Классы и методы -> Перечисления -> Практика 2
Практика #2
Приведите примеры реализации собственного перечисления c любым дополнительным методом.
*/
package classes_and_methods.enums.practice02;

enum Operation {
    SUM,
    MULTIPLY,
    SUBTRACT;

    public double execute(double x, double y) {
        switch (this) {
            case SUM:
                return x + y;
            case MULTIPLY:
                return x * y;
            case SUBTRACT:
                return x - y;
            default:
                return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        Operation op = Operation.SUM;

        System.out.println("Сумма: " + op.execute(a, b));

        op = Operation.MULTIPLY;
        System.out.println("Умножение: " + op.execute(a, b));
    }
}