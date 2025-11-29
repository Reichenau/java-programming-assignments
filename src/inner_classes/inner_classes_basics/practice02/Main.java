/*
Внутренние классы -> Внутренние (inner) классы -> Практика 2
Практика #2
Имеет ли внутренний класс доступ к полям и методам внешнего класса?
Ответ: Да, ко всем, даже к private
*/
package inner_classes.inner_classes_basics.practice02;

class Outer {
    public int publicVar = 10;
    private int privateVar = 99;

    private void privateMethod() {
        System.out.println("Вызван приватный метод внешнего класса");
    }

    class Inner {
        void demoAccess() {
            System.out.println("--- Изнутри Inner ---");

            System.out.println("publicVar: " + publicVar);

            System.out.println("privateVar: " + privateVar);

            privateMethod();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.demoAccess();
    }
}