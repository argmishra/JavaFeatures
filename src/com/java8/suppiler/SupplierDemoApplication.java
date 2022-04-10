package com.java8.suppiler;


import java.util.Date;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

// No argument on return type
// One abstract method
public class SupplierDemoApplication {

  public static void main(String[] args) {

    Supplier<Date> supplier1 = () -> new Date();
    System.out.println("Supplier get method demo : " + supplier1.get());

    IntSupplier intSupplier = () -> 56;
    System.out.println("IntSupplier get method demo : " + intSupplier.getAsInt());

  }

}
