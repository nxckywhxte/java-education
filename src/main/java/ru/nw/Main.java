package ru.nw;

import ru.nw.objects.Employee;
import ru.nw.objects.Report;
import ru.nw.strings.StringsMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    StringsMethods stringsMethods = new StringsMethods();
    final String str = "I like Java";
    // Напишите метод, который принимает в качестве параметра любую строку, например “I like
    // Java!!!”.
    stringsMethods.printString(str);

    // Распечатать последний символ строки. Используем метод String.charAt().
    System.out.println(stringsMethods.lastCharOfString(str));

    // Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
    System.out.println(stringsMethods.checkTheEndOfALine(str, "!!!"));

    // Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод
    // String.startsWith().
    System.out.println(stringsMethods.checkTheBeginningOfALine(str, "I like"));

    // Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    System.out.println(stringsMethods.checkStringContainsASubstring(str, "Java"));

    // Найти позицию подстроки “Java” в строке “I like Java!!!”.
    System.out.println(str.indexOf("Java"));

    // Заменить все символы “а” на “о”.
    System.out.println(stringsMethods.changeLetters(str, "a", "o"));

    // Преобразуйте строку к верхнему регистру.
    System.out.println(str.toUpperCase());

    // Преобразуйте строку к нижнему регистру.
    System.out.println(str.toLowerCase());

    /*
    Дано два числа, например 3 и 56, необходимо составить следующие строки:
        3 + 56 = 59
        3 – 56 = -53
        3 * 56 = 168.
     */
    System.out.println(stringsMethods.getStrings(3, 56, '/'));

    // Заменить каждое второе вхождение строки
    String inputString =
        "Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
    String replaceString = "Object-oriented programming";
    System.out.println(stringsMethods.replaceEverySecond(inputString, replaceString));

    // Найти два средних знака строки
    String input = "abfgcgdtrs";
    System.out.println(stringsMethods.findTwoMiddleSigns(input));

    // Список студентов
    String lastName = "Иванов";
    int score = 5;
    String subject = "Математике";
    System.out.println(stringsMethods.getStudentsList(lastName, score, subject));

    // Отчет о сотрудниках, часть 1
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Nikita Belonogov", 5000));
    employees.add(new Employee("Nick Peterson", 50000));
    List<String> reports = Report.generateReport(employees);
    for (String report : reports) {
      System.out.println(report);
    }
  }
}
