/*
Введение -> Основы классов и объектов -> Практика 1
Практика #1
Самостоятельно изучите принцип подстановки Лисков и приведите пример его использования.
*/
package intro.fundamentals_of_classes_and_objects.practice01;

class MessageSender {

    public void sendMessage(String text) {
        System.out.println("Отправка сообщения: " + text);
    }
}

class EmailSender extends MessageSender {

    @Override
    public void sendMessage(String text) {
        System.out.println("Отправка Email: " + text);
    }
}

class SmsSender extends MessageSender {

    @Override
    public void sendMessage(String text) {
        System.out.println("Отправка СМС: " + text);
    }
}

public class Main {
    public static void main(String[] args) {
        MessageSender sender = new EmailSender();

        sender.sendMessage("Текстовое сообщение ");

        sender = new SmsSender();
        sender.sendMessage("1234");
    }
}