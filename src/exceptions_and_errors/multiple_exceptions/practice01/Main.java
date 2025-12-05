/*
Исключения и ошибки -> Обработка нескольких исключений -> Практика 1
Практика #1
Приведите пример кода, в котором продемонстрированы следующие ситуации:
1. Иесколько исключений обрабатываются абсолютно идентичным образом;
2. Исключения, которые обрабатываются, образуют иерархию Ex1 <|-- Ex2 <|-- Ex3,
   т.е. Ex3 - подкласс Ex2, а Ex2 - подкласс Ex1.
*/
package exceptions_and_errors.multiple_exceptions.practice01;

class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Одинаковая обработка ---");
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                int a = 10 / 0;
            } else {
                int[] arr = new int[0];
                int b = arr[1];
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошла ошибка: " + e);
        }


        System.out.println("\n--- Иерархия исключений (Ex3 -> Ex2 -> Ex1) ---");
        try {
            throwEx3();
        } catch (Ex3 e) {
            System.out.println("Пойман Ex3");
        } catch (Ex2 e) {
            System.out.println("Пойман Ex2");
        } catch (Ex1 e) {
            System.out.println("Пойман Ex1");
        } catch (Exception e) {
            System.out.println("Что-то поймано");
        }
    }

    public static void throwEx3() throws Ex3 {
        throw new Ex3();
    }
}