/*
Потоки ввода/вывода -> Байтовые и символьные потоки -> Практика 2
Практика #2
Приведите пример использования одного из подклассов класса OutputStream для демонстрации работы метода write(int).
*/
package io_streams.byte_and_char_streams.practice02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {

            System.out.println("Запись байтов");

            // Пишем байты (коды ASCII)
            output.write(74); // J
            output.write(97); // a
            output.write(118); // v
            output.write(97); // a

            // Превращаем накопленные байты в строку и выводим
            String result = output.toString();
            System.out.println("Записано: " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}