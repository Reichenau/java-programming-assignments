/*
Строки -> StringBuilder и StringBuffer -> Практика 1
Практика #1
Напишите программу, в которой будет продемонстрирована функциональность десяти любых
методов классов StringBuffer и StringBuilder. В комментариях к программе напишите пояснение к используемым методам.
*/
package strings.stringbuilder_and_stringbuffer.practice01;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- StringBuilder ---");
        StringBuilder sb = new StringBuilder("Java");

        // 1. append() - Добавляет текст в конец
        sb.append(" Lesson");
        System.out.println("1. append: " + sb);

        // 2. insert() - Вставляет текст в указанное место (индекс 4)
        sb.insert(4, " Core");
        System.out.println("2. insert: " + sb);

        // 3. delete() - Удаляет часть строки (от индекса 4 до 9)
        sb.delete(4, 9);
        System.out.println("3. delete: " + sb);

        // 4. reverse() - Переворачивает строку задом наперед
        sb.reverse();
        System.out.println("4. reverse: " + sb);

        sb.reverse();

        // 5. setLength() - Обрезает строку или добавляет пустые места
        sb.setLength(4);
        System.out.println("5. setLength: " + sb);


        System.out.println("\n--- StringBuffer ---");
        StringBuffer buffer = new StringBuffer("Hello World");

        // 6. replace() - Заменяет часть строки на другую (с 6 по 11)
        buffer.replace(6, 11, "Java");
        System.out.println("6. replace: " + buffer);

        // 7. charAt() - Получает символ по индексу
        char ch = buffer.charAt(0);
        System.out.println("7. charAt(0): " + ch);

        // 8. setCharAt() - Меняет один символ по индексу
        buffer.setCharAt(0, 'h');
        System.out.println("8. setCharAt: " + buffer);

        // 9. capacity() - Показывает размер внутреннего буфера
        // Обычно это (длина строки + 16 символов запаса)
        System.out.println("9. capacity: " + buffer.capacity());

        // 10. deleteCharAt() - Удаляет один конкретный символ
        buffer.deleteCharAt(5);
        System.out.println("10. deleteCharAt: " + buffer);
    }
}