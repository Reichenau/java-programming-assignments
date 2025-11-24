/*
Классы и методы -> Ограничение доступа -> Практика 1
Самостоятельно изучите смысл каждого спецификатор доступа и приведите пример программы,
демонстрирующей это. Не забудьте про случай, когда спецификатор доступа отсутствует.

Класс-хранилище с разными модификаторами доступа.
*/
package classes_and_methods.access_modifiers.practice01;

public class Storage {

    public String varPublic = "Public: доступен всем";

    protected String varProtected = "Protected: доступен внутри класса (и наследникам)";

    String varDefault = "Default: доступен только внутри пакета (текущей папки)";

    private String varPrivate = "Private: доступен только внутри этого класса";

    public void printInternal() {
        System.out.println("Внутри класса Storage : " + varPrivate);
    }
}