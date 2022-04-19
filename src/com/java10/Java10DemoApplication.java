package com.java10;

import java.util.List;
import java.util.Optional;

public class Java10DemoApplication {

  public static void main(String[] args) {

    System.out.println("Local-Variable Type Inference");
    var numbers = List.of(1, 2, 3, 4, 5);
    for (var number : numbers) {
      System.out.println(number);
    }

    System.out.println("orElseThrow() in Optional");
    String str = "";
    Optional<String> name = Optional.ofNullable(str);
    System.out.println(name.orElseThrow());
    System.out.println(name.get());

    System.out.println("copyOf() in Collections");
    List<Integer> copyOfActors = List.copyOf(numbers);
    System.out.println(copyOfActors);

  }

}
