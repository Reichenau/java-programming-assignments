/*
Внутренние классы -> Вложенные (nested) классы -> Практика 1
Практика #1
Приведите примеры "вложение" класса в интерфейс и покажите способ вызова методе такого вложенного класса.
*/
package inner_classes.nested_classes.practice01;

interface Messenger {

    void sendMessage();

    class EmailHelper {

        public void printHelp() {
            System.out.println("Это метод вложенного класса");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Работа с классом внутри интерфейса:");


        Messenger.EmailHelper helper = new Messenger.EmailHelper();

        helper.printHelp();
    }
}