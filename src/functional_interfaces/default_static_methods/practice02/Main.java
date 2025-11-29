/*
Функциональные интерфейсы -> Методы default и static -> Практика 2
Практика #2

Что произойдет, если класс реализует два интерфейса с одинаковыми неабстрактными методами?
Как выйти из такого положения? Приведите пример.
Ответ: Ошибка компиляции. Нужно переопределить метод вручную
*/
package functional_interfaces.default_static_methods.practice02;

interface Worker {
    default void work() {
        System.out.println("Рабочий работает");
    }
}

interface Student {
    default void work() {
        System.out.println("Студент учится");
    }
}

class Person implements Worker, Student {

    @Override
    public void work() {
        System.out.println("--- Решение конфликта ---");

        Worker.super.work();
        Student.super.work();

        System.out.println("Человек делает всё сразу");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.work();
    }
}