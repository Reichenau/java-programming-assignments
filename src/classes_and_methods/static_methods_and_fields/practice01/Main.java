/*
Классы и методы -> Статические методы и поля -> Практика 1
Практика #1
Приведите все варианты вызова метода printVars()
public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}
*/
package classes_and_methods.static_methods_and_fields.practice01;

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a=" + a + ", b=" + b);
    }
}

public class Main {
    public static void main(String[] args) {

        // --- Через имя класса ---
        System.out.println("--- Через имя класса ---");
        A.printVars();


        // --- Через экземпляр класса ---
        System.out.println("\n--- Через объект ---");
        A obj = new A();
        obj.printVars();


        // ---Через null ---
        System.out.println("\n--- Через переменную с null ---");
        A emptyRef = null;
        emptyRef.printVars(); 
    }
}