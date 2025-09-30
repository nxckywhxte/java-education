package ru.nw.objects;

public class Person {
  private String name;

  /** Default constructor */
  public Person() {}

  /** Constructor that has parameter name */
  public Person(String name) {
    this.name = name;
  }

  public String toString() {
    return "\n==============================\n"
        + "Person:\n"
        + "Name: "
        + name
        + "\n==============================\n";
  }
}
