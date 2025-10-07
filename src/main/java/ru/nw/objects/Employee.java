package ru.nw.objects;

public class Employee {
  private final String fullName;

  public String getFullName() {
    return fullName;
  }

  public float getSalary() {
    return salary;
  }

  private final float salary;

  public Employee(String fullName, int salary) {
    this.fullName = fullName;
    this.salary = salary;
  }
}
