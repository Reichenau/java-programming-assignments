/*
Исключения и ошибки -> Собственные исключения -> Практика 1
Практика #1
Приведите пример собственного класса исключения.
*/
package exceptions_and_errors.custom_exceptions.practice01;

class MyFirstException extends Exception {

    // 1. Пустой конструктор
    public MyFirstException() {
        super();
    }

    // 2. Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // 3. Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Проверка возраста: ");
            checkAge(-5);
        } catch (MyFirstException e) {
            System.out.println("Перехват собственного исключения");
            System.out.println("Сообщение: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws MyFirstException {
        if (age < 0) {
            throw new MyFirstException("Возраст не может быть отрицательным");
        }
        System.out.println("Возраст принят: " + age);
    }
}