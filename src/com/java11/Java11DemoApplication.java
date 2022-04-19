package com.java11;

import java.util.stream.Collectors;

interface Addition {
  void add(int a, int b);
}

public class Java11DemoApplication {

  public static void main(String[] args) {
    System.out.println("String API");
    System.out.println("".isBlank());
    System.out.println(" ".isBlank());

    String str = "JD\nJD\nJD";
    System.out.println(str.lines().collect(Collectors.toList()));

    str = " TEST ";
    System.out.println(str.strip().length());
    System.out.println(str.stripLeading().length());
    System.out.println(str.stripTrailing().length());

    Addition add = (var a, var b) -> System.out.println("Addition is : " + (a + b));
    add.add(3, 4);
  }
}