/*
Функциональные интерфейсы -> Методы default и static -> Практика 1
Практика #1
Приведите пример интерфейса, в котором определен один неабстрактный метод и один статический метод,
а также класс, реализующий этот интерфейс. Покажите все способы вызова методов интерфейса.
*/
package functional_interfaces.default_static_methods.practice01;

interface MyInterface {

    // 1. Дефолтный метод (имеет тело)
    default void defaultMethod() {
        System.out.println("Вызван default метод интерфейса");
    }

    // 2. Статический метод
    static void staticMethod() {
        System.out.println("Вызван static метод интерфейса");
    }
}

class MyClass implements MyInterface {
}

public class Main {
    public static void main(String[] args) {
        // Способ 1: Вызов default метода
        MyClass obj = new MyClass();
        obj.defaultMethod();

        // Способ 2: Вызов static метода
        MyInterface.staticMethod();

    }
}