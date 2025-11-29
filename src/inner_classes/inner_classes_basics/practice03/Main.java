/*
Внутренние классы -> Внутренние (inner) классы -> Практика 3
Практика #3
Имеет ли внешний класс доступ к полям и методам внутреннего класса?
Ответ: Да, но нужно сначала создать объект внутреннего класса. Видит даже private
*/
package inner_classes.inner_classes_basics.practice03;

class Outer {

    void accessInnerClass() {
        Inner inner = new Inner();

        System.out.println("--- Изнутри Outer ---");

        System.out.println("innerPublic: " + inner.innerPublic);

        System.out.println("innerPrivate: " + inner.innerPrivate);
    }

    class Inner {
        public int innerPublic = 1;
        private int innerPrivate = 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInnerClass();
    }
}