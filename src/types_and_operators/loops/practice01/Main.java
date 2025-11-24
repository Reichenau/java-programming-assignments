/*
Типы данных и операторы -> Циклы -> Практика 1
Практика #1
Приведите тривиальные примеры бесконечных циклов для конструкций while и do-while.
*/
package types_and_operators.loops.practice01;

public class Main {
    public static void main(String[] args) {

        // --- while ---
        while (true) {
            System.out.println("Бесконечный while");
        }

        // --- do-while ---
        do {
            System.out.println("Бесконечный do-while");
        } while (true);

        // ЧТобы заработало, нужно один из циклов закомментировать
    }
}