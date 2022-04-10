package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

interface Car {
  void speed();
}

interface Add {
  void add(int a, int b);
}

interface Length {
  int calculate(String s);
}

interface Square {
  int size(int a);
}

public class LambdaDemoApplication {

  public static void main(String[] args) {
    basicLamdba();
    listWithLambda();
    setWithLambda();
    objectLambda();
  }

  private static void objectLambda() {
    ArrayList<Emp> emps = new ArrayList<Emp>();
    emps.add(new Emp(1L, "A"));
    emps.add(new Emp(4L, "D"));
    emps.add(new Emp(3L, "C"));
    emps.add(new Emp(2L, "B"));


    System.out.println(emps);
    Collections.sort(emps, (a, b) -> (a.id > b.id) ? -1 : (a.id < b.id) ? 1 : 0);
    System.out.println(emps);
  }


  private static void listWithLambda() {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(12);
    list.add(2);
    list.add(3);
    list.add(0);
    list.add(6);

    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list, (a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0);
    System.out.println(list);
  }

  private static void setWithLambda() {
    TreeSet<Integer> set = new TreeSet<Integer>((a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0);
    set.add(12);
    set.add(2);
    set.add(3);
    set.add(0);
    set.add(6);

    System.out.println(set);
  }

  private static void basicLamdba() {
    Car car = () -> System.out.println("Car Speed is 50");
    car.speed();

    Add add = (a, b) -> System.out.println("Addition is : " + (a + b));
    add.add(3, 4);

    Length length = s -> s.length();
    System.out.println("Length is : " + length.calculate("Anurag"));

    Square square = a -> a * a;
    System.out.println("Square size is : " + square.size(3));
  }

}

class Emp {

  public Long id;
  public String name;

  public Emp(Long id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Emp [id=" + id + ", name=" + name + "]";
  }


}