package com.java8.funInf;

@FunctionalInterface
interface Foo {
  // General Utility methods
  static void show() {
    System.out.println("Static Method");
  }

  String method(String string);

  // Backward compatability
  default void print() {
    System.out.println("Default Method");
  }
}

public class FunctionInterfaceDemo implements Foo {

  public static void main(String[] args) {
    Foo foo = p -> p + " from lambda";
    String result = foo.method("Message ");
    System.out.println("Result is : " + result);

    Foo.show();

    new FunctionInterfaceDemo().print();


  }

  @Override
  public String method(String string) {
    return "Hello";
  }

}



