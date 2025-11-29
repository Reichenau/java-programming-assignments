/*
Строки -> Класс String -> Практика 1
Практика #1
Напишите программу, в которой будет продемонстрирована функциональность десяти любых методов класса String.
В комментариях к программе напишите пояснение к используемым методам.
*/
package strings.string_class.practice01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "  Hello, Java World!  ";
        System.out.println("Исходная строка: [" + str + "]");

        // 1. length() - Возвращает длину строки (количество символов)
        System.out.println("1. Длина: " + str.length());

        // 2. trim() - Удаляет пробелы в начале и в конце строки
        String trimmed = str.trim();
        System.out.println("2. Без пробелов по краям: [" + trimmed + "]");

        // 3. toUpperCase() - Переводит все буквы в верхний регистр
        System.out.println("3. Верхний регистр: " + trimmed.toUpperCase());

        // 4. toLowerCase() - Переводит все буквы в нижний регистр
        System.out.println("4. Нижний регистр: " + trimmed.toLowerCase());

        // 5. substring(int begin, int end) - Вырезает часть строки (от индекса 7 до 11)
        // В слове "Hello, Java World!" с 7-го символа начинается "Java"
        System.out.println("5. Подстрока (7-11): " + trimmed.substring(7, 11));

        // 6. contains(CharSequence s) - Проверяет, содержится ли подстрока внутри
        System.out.println("6. Содержит слово 'World'? " + trimmed.contains("World"));

        // 7. replace(old, new) - Заменяет символы или слова
        System.out.println("7. Замена: " + trimmed.replace("World", "Student"));

        // 8. charAt(int index) - Возвращает символ по индексу
        System.out.println("8. Символ под индексом 0: " + trimmed.charAt(0));

        // 9. startsWith(String prefix) - Проверяет, начинается ли строка с указанного текста
        System.out.println("9. Начинается на 'Hello'? " + trimmed.startsWith("Hello"));

        // 10. split(String regex) - Разбивает строку на массив слов по разделителю (например, пробел)
        String[] words = trimmed.split(" ");
        System.out.println("10. Разбиение на слова: " + Arrays.toString(words));
    }
}