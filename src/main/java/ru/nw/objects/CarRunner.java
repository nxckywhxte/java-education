package ru.nw.objects;

public class CarRunner {
  public static void main(String[] args) {
    Car bwm = new Car();
    bwm.setType("BMW");
    System.out.println("Car type (using getter): " + bwm.getType());
    System.out.println("Car info (using toString() method): " + bwm);
  }
}
