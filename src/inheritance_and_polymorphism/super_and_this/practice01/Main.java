/*
Наследование и полиморфизм -> Использование super и this -> Практика 1
Практика #1
Приведите пример кода, демонстрирующего все три варианта использования ключевого слова super.
*/
package inheritance_and_polymorphism.super_and_this.practice01;

class Parent {
    String name = "Родитель";

    // Конструктор родителя
    Parent(String message) {
        System.out.println("Конструктор Parent вызван с сообщением: " + message);
    }

    void sayHello() {
        System.out.println("Сообщение из класса Parent!");
    }
}

class Child extends Parent {
    String name = "Ребенок";

    Child() {
        // --- Обращение к конструктору суперкласса ---
        super("Предок");
    }

    void testSuper() {
        System.out.println("Super");

        // --- Доступ к полю суперкласса ---
        System.out.println("Мое имя (this.name): " + this.name);
        System.out.println("Имя родителя (super.name): " + super.name);

        // --- Доступ к методу суперкласса ---
        super.sayHello();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.testSuper();
    }
}