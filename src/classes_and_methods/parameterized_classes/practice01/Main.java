/*
Классы и методы -> Параметризованные классы -> Практика 1
Практика #1
Приведите примеры использования оператора instanceof с объектами параметризованных классов.
*/
package classes_and_methods.parameterized_classes.practice01;

class Box<T> {
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        Box<String> strBox = new Box<>();

        System.out.println("intBox is Box? " + (intBox instanceof Box));
        System.out.println("strBox is Box? " + (strBox instanceof Box<?>));

        // 2. Ошибка компиляции
        // Нельзя проверить конкретный параметр типа, так как в рантайме он стирается.

        // if (intBox instanceof Box<Integer>) { }
        // if (strBox instanceof Box<String>) { }

        System.out.println("Проверить точный тип T через instanceof не получается");
    }
}