/*
Потоки ввода/вывода -> Байтовые и символьные потоки -> Практика 4
Практика #4
Зачем нужен интерфейс AutoCloseable? Приведите пример.
*/
package io_streams.byte_and_char_streams.practice04;

class MyResource implements AutoCloseable {

    public void doWork() {
        System.out.println("Ресурс работает");
    }

    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Начало try-with-resources ---");

        try (MyResource resource = new MyResource()) {
            resource.doWork();
            System.out.println("--- Конец блока try ---");
        }

        System.out.println("--- Программа завершена ---");
    }
}