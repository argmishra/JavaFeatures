package com.java8.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

// Takes argument and return any value
// One abstract, two default, one static
public class FunctionDemoApplication {
  public static void main(String[] args) {
    Function<String, Integer> function1 = s -> s.length();

    System.out.println("Function method apply demo : " + function1.apply("anurag"));

    Function<Integer, Integer> function2 = s -> s + s;
    Function<Integer, Integer> function3 = s -> s * s * s;

    System.out.println("Function method compose demo : " + function2.compose(function3).apply(2));
    System.out.println("Function method andThen demo : " + function2.andThen(function3).apply(2));

    Function<Integer, Integer> function4 = Function.identity();

    System.out.println("Function method identity demo : " + function4.apply(4));

    BiFunction<String, String, Integer> biFunction1 = (s, t) -> s.length() + t.length();
    System.out.println("BiFunction demo : " + biFunction1.apply("anurag", "mishra"));

    IntFunction<Integer> intFunction = s -> s * s;
    System.out.println("IntFunction demo : " + intFunction.apply(4));

    ToIntFunction<String> toIntFunction = s -> s.length();
    System.out.println("IntFunction demo : " + toIntFunction.applyAsInt("oPTIMUS"));


  }
}
