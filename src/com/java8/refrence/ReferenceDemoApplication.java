package com.java8.refrence;

interface Student {
  void demo();

}

interface Inter {
  Sample get();
}

public class ReferenceDemoApplication {

  public static void main(String[] args) {
    Student student = ReferenceDemoApplication::show;
    student.demo();

    Inter i = Sample::new;
    i.get();
  }

  public static void show() {
    System.out.println("Method Reference");
  }
}

class Sample {
  Sample() {
    System.out.println("Constructor Reference");

  }
}