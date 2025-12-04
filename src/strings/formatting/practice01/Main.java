/*
Строки -> Форматирование информации -> Практика 1
Практика #1
Приведите пример использования пяти любых спецификаторов из таблицы.
*/
package strings.formatting.practice01;

public class Main {
    public static void main(String[] args) {
        String name = "Java";
        int version = 21;
        double price = 0.0;
        boolean isGood = true;

        // 1. %s - Строка
        // 2. %d - Целое число
        // 3. %f - Число с точкой
        // 4. %b - Логическое значение
        // 5. %n - Перенос строки

        System.out.printf("Язык: %s%n", name);
        System.out.printf("Версия: %d%n", version);
        System.out.printf("Цена: %.2f руб.%n", price);
        System.out.printf("Объектно ориентированный? %b%n", isGood);

        System.out.printf("Итог: %s версии %d - это %b!%n", name, version, isGood);
    }
}