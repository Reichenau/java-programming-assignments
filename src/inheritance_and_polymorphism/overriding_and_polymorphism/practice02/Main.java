/*
Наследование и полиморфизм -> Переопределение методов и полиморфизм -> Практика 2
Практика #2
Приведите пример переопределенного метода.
Вопрос: Что будет, если у методов не совпадет тип возвращаемого значения?
Ответ: Будет ошибка компиляции (attempting to use incompatible return type)
*/
package inheritance_and_polymorphism.overriding_and_polymorphism.practice02;

class text {
    public void prntHello() {
        System.out.println("Say: ");
    }

    public int getAge() {
        return 1;
    }
}

class Hello extends text {

    @Override
    public void prntHello() {
        System.out.println("Hello");
    }

    // Нужно раскомментиротвать так как выпадет ошибка
    /*
    @Override
    public String getAge() {
        return "Два";
    }
    */
}

public class Main {
    public static void main(String[] args) {
        text b = new Hello();
        b.prntHello();
    }
}