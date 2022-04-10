package com.java8.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

// To print or call method (no return type)
// One abstract, one default
public class ConsumerDemoApplication {
  public static void main(String[] args) {

    Consumer<String> consumer1 = s -> System.out.println(s);
    consumer1.accept("Consumer method accept demo");

    Consumer<String> consumer2 = s -> System.out.println(s);
    Consumer<String> consumer3 = consumer1.andThen(consumer2);
    consumer3.accept("Consumer method andThen demo");

    BiConsumer<String, String> biConsumer1 = (s, t) -> System.out.println(s + " " + t);
    biConsumer1.accept("anurag", "mishra");

    IntConsumer intConsumer1 = s -> System.out.println(s);
    intConsumer1.accept(10);

  }

}