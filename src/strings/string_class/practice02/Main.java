/*
Строки -> Класс String -> Практика 2
Практика #2
Приведите примеры использования класса StringJoiner.
*/
package strings.string_class.practice02;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        // ПРИМЕР 1: Простое соединение через разделитель
        // Указываем только delimiter (разделитель)
        StringJoiner joiner1 = new StringJoiner(" : ");

        joiner1.add("Login");
        joiner1.add("Password");
        joiner1.add("Token");

        System.out.println("Пример 1: " + joiner1);

        // ПРИМЕР 2: Разделитель + Обертка (Префикс и Суффикс)
        // Удобно для создания списков в скобках.
        // delimiter = ", "
        // prefix = "["
        // suffix = "]"
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");

        joiner2.add("Красный");
        joiner2.add("Зеленый");
        joiner2.add("Синий");

        System.out.println("Пример 2: " + joiner2);
    }
}