package com.java8.optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class OptionalDemoApplication {
  public static void main(String[] args) {

    Optional<String> emptyStringOptional = Optional.empty();
    System.out.println("isEmpty Method Demo : " + emptyStringOptional.isEmpty());
    System.out.println("isPresent Method Demo : " + emptyStringOptional.isPresent());
    emptyStringOptional.ifPresent(name -> System.out.println("ifPresent Method demo : "  +name.length()));

    Optional<String> nonemptyStringOptional = Optional.of("ANURAG");
    System.out.println("isEmpty Method Demo : " + nonemptyStringOptional.isEmpty());
    System.out.println("isPresent Method Demo : " + nonemptyStringOptional.isPresent());
    nonemptyStringOptional.ifPresent(name -> System.out.println("ifPresent Method demo : " +name.length()));

    System.out.println("orElse Method Demo : " + emptyStringOptional.orElse("default"));
    System.out.println("orElseGet Method Demo : " + emptyStringOptional.orElseGet(() ->  "default"));
    System.out.println("get Method Demo : " + nonemptyStringOptional.get());
    System.out.println("filter Method Demo : " + nonemptyStringOptional.filter(a -> a.equals("ANURAG")).isPresent());


    Consumer<String>
        stringConsumer = (s) -> System.out.println("The value stored in Optional object - " + s);
    Runnable runnable = () -> System.out.println("No value stored in the Optional object");
    emptyStringOptional.ifPresentOrElse(stringConsumer, runnable);

    System.out.println("orElseThrow Method Demo : " + emptyStringOptional.orElseThrow(NullPointerException::new));
    System.out.println("orElseThrow Method Demo : " + emptyStringOptional.orElseThrow());

  }
  }
