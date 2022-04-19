package com.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

interface Test {
  private static String demo() {
    return "DEMO";
  }

  default String show() {
    return demo() + " NOW";
  }
}

public class Java9DemoApplication implements Test {

  public static void main(String[] args) throws IOException {
    System.out.println("Factory Methods Collections");
    System.out.println("Immutable List Demo : " + List.of(1, 2, 3, 4, 5));
    System.out.println("Immutable Map Demo : " + Map.of(1, "one", 2, "two", 3, "three"));

    System.out.println("Private Methods in Interface");
    Test test = new Java9DemoApplication();
    System.out.println(test.show());

    System.out.println("Try with resources improvement");
    BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
    try (reader1) {
      System.out.println(reader1.readLine());
    }

  }
}