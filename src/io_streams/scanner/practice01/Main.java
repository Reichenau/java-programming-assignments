/*
Потоки ввода/вывода -> Класс Scanner -> Практика 1
Практика #1
Приведите пример кода для чтение данных из текстового файла с помощью Scanner.
*/
package io_streams.scanner.practice01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/io_streams/scanner/practice01/input.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден");
        }
    }
}