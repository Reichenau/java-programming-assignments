/*
Типы данных и операторы -> Классы-оболочки -> Практика 3
Практика #3
В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException.
Приведите пример.
*/
package types_and_operators.wrapper_classes.practice03;

public class Main {
    public static void main(String[] args) {
        Integer myNullObject = null;

        System.out.println("Распаковка null");

        try {
            // вылетает NullPointerException.
            int myPrimitive = myNullObject;

            System.out.println("Это сообщение не выведется: " + myPrimitive);

        } catch (NullPointerException e) {
            System.out.println("Ошибка, NullPointerException при автораспаковке");
        }

        try {
            int result = myNullObject + 10;
        } catch (NullPointerException e) {
            System.out.println("Ошибка в арифметке");
        }
    }
}