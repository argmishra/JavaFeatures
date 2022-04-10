package com.java8.operator;

import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.UnaryOperator;

// Same parameter to pass and return
public class OperatorDemApplication {

  public static void main(String[] args) {

    UnaryOperator<Integer> unaryOperator1 = t -> t * 5;
    System.out.println("UnaryOperator get method demo : " + unaryOperator1.apply(9));

    IntUnaryOperator intUnaryOperator = t -> t * 5;
    System.out.println("IntUnaryOperator get method demo : " + intUnaryOperator.applyAsInt(9));

    DoubleUnaryOperator doubleUnaryOperator = t -> t * 5;
    System.out.println(
        "DoubleUnaryOperator get method demo : " + doubleUnaryOperator.applyAsDouble(9));

    BinaryOperator<String> binaryOperator = (a, b) -> a + "  " + b;
    System.out.println(
        "BinaryOperator get method demo : " + binaryOperator.apply("Anurag", "Mishra"));

    LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
    System.out.println(
        "LongBinaryOperator get method demo : " + longBinaryOperator.applyAsLong(5, 6));

  }
}
