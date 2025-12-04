/*
Строки -> Форматирование информации -> Практика 3
Практика #3
Приведите пример использования пяти любых спецификаторов из таблицы.
*/
package strings.formatting.practice03;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();


        // 1. %tY - Год
        // 2. %tB - Полное название месяца
        // 3. %tA - Полное название дня недели
        // 4. %tH - Час
        // 5. %tM - Минуты

        System.out.printf("Сегодня: %tA, %tB %tY года%n", now, now, now);
        System.out.printf("Точное время: %tH:%tM%n", now, now);

        System.out.printf("Коротко: %1$td.%1$tm.%1$ty", now);
    }
}