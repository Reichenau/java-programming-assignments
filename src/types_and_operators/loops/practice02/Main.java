/*
Типы данных и операторы -> Циклы -> Практика 2
Практика #2
Приведите пример использования операторов break и continue с любым видом цикла.
*/
package types_and_operators.loops.practice02;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {

            // --- continue ---
            if (i == 5) {
                System.out.println("Пропускаем число 5 ");
                continue;
            }

            // --- break ---
            if (i == 8) {
                System.out.println("Выход из цикла на числе 8");
                break;
            }

            System.out.println("Число: " + i);
        }

    }
}