/*
Введение -> Консольный ввод – вывод -> Практика 1
Практика #1
Напишите программу, которая просит ввести имя и выводит на консоль строку "Привет, <введенное имя>".
*/
package intro.console_input_output.practice01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");

        String name = scan.next();

        System.out.println("Привет, " + name);
    }
}