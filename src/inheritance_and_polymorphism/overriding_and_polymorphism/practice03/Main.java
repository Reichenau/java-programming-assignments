/*
Наследование и полиморфизм -> Переопределение методов и полиморфизм -> Практика 3
Практика #3
Приведите пример и объясните, когда использование аннотации @Override помогает обнаружить ошибку.
*/
package inheritance_and_polymorphism.overriding_and_polymorphism.practice03;

class Parent {
    public void printInfo() {
        System.out.println("Инфо родителя");
    }
}

class Child extends Parent {

    // --- Ошибка в названии (без @Override) ---
    /*
    Допустим хотели переоределить функцию, но в названии опечатались, без аннотации компилятор думает, что мы
    определили новый метод
     */

    public void printInf() {
        System.out.println("Инфо ребенка. ошибка");
    }


    // --- Защита с @Override ---

    /*
    Допустим хотели переоределить функцию, но в названии опечатались, с аннотацией компилятор выдаст ошибку
     */

    /*
    Нужно раскомментиротвать так как выпадет ошибка
    @Override
    public void printInf() {
        System.out.println("Это не скомпилируется");
    }
    */

    // Правильный вариант
    @Override
    public void printInfo() {
        System.out.println("Инфо ребенка. корректно");
    }
}

public class Main {
    public static void main(String[] args) {
        new Child().printInfo();
    }
}