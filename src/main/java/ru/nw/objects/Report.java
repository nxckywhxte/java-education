package ru.nw.objects;

import java.util.ArrayList;
import java.util.List;

public class Report {
  public static List<String> generateReport(List<Employee> employees) {
    List<String> result = new ArrayList<>();
    for (Employee employee : employees) {
      result.add(String.format("Работник %-25s получает заработную плату в размере %.2f", employee.getFullName(), employee.getSalary()));
    }
    return result;
  }
}
