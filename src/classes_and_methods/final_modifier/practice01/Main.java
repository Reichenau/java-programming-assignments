/*
Классы и методы -> Модификатор final и неизменяемость -> Практика 1
Практика #1
Как можно проинициализировать константу, которая объявлена следующим образом? Приведите все возможные варианты.

public class A {
    public final int a;
}
*/
package classes_and_methods.final_modifier.practice01;

public class Main {
    public static void main(String[] args) {
        Variant1 v1 = new Variant1();
        System.out.println("Конструктор: " + v1.a);

        Variant2 v2 = new Variant2();
        System.out.println("логический блок: " + v2.a);
    }
}

// --- Конструктор ---
class Variant1 {
    public final int a;

    public Variant1() {
        this.a = 10;
    }
}

// --- Логический блок ---
class Variant2 {
    public final int a;

    {
        a = 20;
    }

}