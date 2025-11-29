/*
Наследование и полиморфизм -> Классы и методы final -> Практика 2
Практика #2
Приведите пример кода, демонстрирующего невозможность использовать наследование для final-класса.
*/
package inheritance_and_polymorphism.final_classes_and_methods.practice02;

final class SecureDatabase {
    public void connect() {
        System.out.println("Подключение к базе...");
    }
}

// Нужно раскомментировать тк выпадет ошибка компиляции
/*
class HackerClass extends SecureDatabase {
}
*/


public class Main {
    public static void main(String[] args) {
        SecureDatabase db = new SecureDatabase();
        db.connect();
    }
}