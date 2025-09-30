package ru.nw.objects;

public class DeveloperRunner {
  public static void main(String[] args) {
    Developer developer = new Developer(1, "Proselyte", "Developer", "Java", 3, 3000);
    System.out.println("Developer's Info:");
    System.out.println(developer);

    developer.writeCode();
    developer.getDepressed();
    developer.solveProblem();
    developer.writeCode();
    developer.enjoyTheLife();

    System.out.println("That's all...");
  }
}
