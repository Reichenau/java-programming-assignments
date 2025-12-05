/*
Потоки ввода/вывода -> Байтовые и символьные потоки -> Практика 1
Практика #1
Приведите пример использования одного из подклассов класса InputStream для демонстрации работы метода read().
*/
package io_streams.byte_and_char_streams.practice01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        byte[] buffer = {65, 66, 67};

        try (InputStream input = new ByteArrayInputStream(buffer)) {
            System.out.println("Чтение по одному байту");

            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}