/*
Наследование и полиморфизм -> Классы и методы final -> Практика 1
Практика #1
Приведите пример кода, демонстрирующего невозможность переопределять в подклассе final-метод суперкласса.
*/
package inheritance_and_polymorphism.final_classes_and_methods.practice01;

class Parent {
    public final void printMessage() {
        System.out.println("Это финальный метод родителя.");
    }
}

class Child extends Parent {

    // Нужно раскомментировать тк выпадет ошибка компиляции
    /*
    @Override
    public void printMessage() {
        System.out.println("Попытка изменить логику");
    }
    */

}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.printMessage();
    }
}