/*
Классы и методы -> Ограничение доступа -> Практика 1
Самостоятельно изучите смысл каждого спецификатор доступа и приведите пример программы,
демонстрирующей это. Не забудьте про случай, когда спецификатор доступа отсутствует.

Проверка доступа из соседнего класса.
*/
package classes_and_methods.access_modifiers.practice01;

public class Main {
    public static void main(String[] args) {
        Storage s = new Storage();

        System.out.println("--- Проверка доступа ---");

        // --- public ---
        System.out.println(s.varPublic);

        // --- protected ---
        System.out.println(s.varProtected);

        // --- default ---
        System.out.println(s.varDefault);

        // --- private ---
        // Нужно раскомментировать

        // System.out.println(s.varPrivate); 

        System.out.println("Private поле недоступно, ошибка");
    }
}