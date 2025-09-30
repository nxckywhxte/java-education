package ru.nw.strings;

public class StringsMethods {
  // Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
  public void printString(String str) {
    System.out.println(str);
  }

  // Распечатать последний символ строки. Используем метод String.charAt().
  public char lastCharOfString(String str) {
    return str.charAt(str.length() - 1);
  }

  // Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
  public boolean checkTheEndOfALine(String str, String endOfALine) {
    return str.endsWith(endOfALine);
  }

  // Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
  public boolean checkTheBeginningOfALine(String str, String beginString) {
    return str.startsWith(beginString);
  }

  // Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
  public boolean checkStringContainsASubstring(String str, String substring) {
    return str.contains(substring);
  }

  // Заменить все символы “а” на “о”.
  public String changeLetters(String str, String letter, String newLetter) {
    return str.replace(letter, newLetter);
  }

  /* Дано два числа, например 3 и 56, необходимо составить следующие строки:
  * 3 + 56 = 59
    3 – 56 = -53
    3 * 56 = 168.
  */
  public String getStrings(int num1, int num2, char operator) {
    StringBuilder sb = new StringBuilder();

    switch (operator) {
      case '+':
        sb.append(num1);
        sb.append(" + ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 + num2);
        return sb.toString();
      case '-':
        sb.append(num1);
        sb.append(" - ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 - num2);
        return sb.toString();
      case '*':
        sb.append(num1);
        sb.append(" * ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 * num2);
        return sb.toString();
      case '/':
        if (num2 != 0) {
          sb.append(num1);
          sb.append(" / ");
          sb.append(num2);
          sb.append(" = ");
          sb.append(num1 / num2);
          return sb.toString();
        } else {
          return "Ошибка: деление на ноль невозможно!";
        }
      default:
        System.out.println("Ошибка: неверный оператор!");
        break;
    }
    return sb.toString();
  }
}
