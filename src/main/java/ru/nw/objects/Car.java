package ru.nw.objects;

public class Car {
  String type;

  public Car() {}

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "\n===============\n" + "Car:" + "\nType:" + type + "\n===============\n";
  }
}
