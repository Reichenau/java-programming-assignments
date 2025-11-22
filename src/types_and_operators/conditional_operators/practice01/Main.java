/*
Типы данных и операторы -> Оператор условного перехода -> Практика 1
Практика #1
Запишите код через конструкцию ? : (тернарный оператор).
int i = 0;
if (a == 1) {
    i = 1;
} else if (a == 2) {
    i = 2;
} else {
    i = 3;
}
*/
package types_and_operators.conditional_operators.practice01;

public class Main {
    public static void main(String[] args) {
        // Для примера возьмем число a
        int a = 2;
        int i = 0;

        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;


        System.out.println("при a = " + a + ", i = " + i);
    }
}