package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemoApplication {

  public static void main(String[] args) {

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(0);
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(5);
    arrayList.add(15);
    arrayList.add(25);
    arrayList.add(15);
    List<String> stringStream = List.of("A", "B", "C", "D", "E");

    System.out.println("ArrayList : " + arrayList);

    System.out.println("Size ArrayList : " + arrayList);
    System.out.println(
        "Unique Size ArrayList : " + arrayList.stream().distinct().collect(Collectors.toList()));

    List<Integer> evenList =
        arrayList.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
    System.out.println("filter method demo : " + evenList);
    Stream<String> longStringsStream = stringStream.stream().filter((value) -> {
      return value.length() >= 0;
    });
    longStringsStream.forEach(System.out::println);

    List<Integer> doubleList = arrayList.stream().map(i -> i * 2).collect(Collectors.toList());
    System.out.println("map method demo : " + doubleList);

    System.out.println("Count Method Demo : " + doubleList.stream().count());

    System.out.println(
        "Sorted Method Demo : " + arrayList.stream().sorted().collect(Collectors.toList()));

    Comparator<Integer> integerComparator = (a, b) -> b.compareTo(a);
    System.out.println("Custom Sorted Method Demo : " +
        arrayList.stream().sorted(integerComparator).collect(Collectors.toList()));

    System.out.println(
        "Max Method Demo : " + arrayList.stream().max((a, b) -> a.compareTo(b)).get());

    System.out.println(
        "Min Method Demo : " + arrayList.stream().min((a, b) -> a.compareTo(b)).get());

    System.out.println("forEach Method Demo : ");
    arrayList.stream().forEach(s -> System.out.print(s + " "));
    arrayList.stream().forEach(System.out::println);

    System.out.println("toArray Method Demo : " + arrayList.stream().toArray());

    System.out.println("IntStream Method Demo : ");
    IntStream.range(1, 10).forEach(System.out::print);
    System.out.println();
    IntStream.rangeClosed(1, 10).forEach(System.out::print);
    System.out.println();

    System.out.println("findFirst Method Demo : " +
        Arrays.stream(arrayList.stream().toArray()).findFirst().get());

    Integer[] arrays = {1, 2, 3, 4, 5, 6};
    System.out.println("findAny Method Demo : " +
        Arrays.stream(arrays).filter(n -> n < 10).findAny().get());

    System.out.println("Average Method Demo : " +
        arrayList.stream().mapToInt(i -> i).average().getAsDouble());

    System.out.println("summaryStatistics Method Demo : " +
        arrayList.stream().mapToInt(i -> i).summaryStatistics());

    System.out.println("groupingBy counting Method Demo : " +
        arrayList.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    System.out.println("reduce Method Demo : " +
        arrayList.stream().reduce(0, (a, b) -> a + b));

    System.out.println("peek Method Demo : " +
        arrayList.stream()
            .filter(e -> e % 2 == 0).peek(e -> System.out.println(e))
            .filter(e -> e > 0).peek(e -> System.out.println(e))
            .collect(Collectors.toList()));

    System.out.println("skip and limit Method Demo : " +
        arrayList.stream().skip(2).limit(3).collect(Collectors.toList()));

    System.out.println("orElse Method Demo : " +
        arrayList.stream().filter(e -> e < 0).findFirst().orElse(2222));

    System.out.println("allMatch Method Demo : " + arrayList.stream().allMatch(i -> i % 2 == 0));
    System.out.println("anyMatch Method Demo : " + arrayList.stream().anyMatch(i -> i % 2 == 0));
    System.out.println("noneMatch Method Demo : " + arrayList.stream().noneMatch(i -> i % 2 == 0));

    System.out.println("Collectors joining Method Demo : " + stringStream.stream()
        .collect(Collectors.joining(", ")));

    System.out.println("Collectors partitioningBy Method Demo : " +
        arrayList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0)));

    System.out.println("Collectors groupingBy Method Demo : " +
        arrayList.stream().collect(Collectors.groupingBy(i -> i % 2 == 0)));

    System.out.println("parallel Method Demo : ");
    arrayList.stream().parallel().forEach(e -> System.out.println(e + " "));

    System.out.println("infinite stream generate Method Demo : ");
    Stream.generate(Math::random).limit(5).forEach(System.out::println);

    System.out.println("infinite stream iterate Method Demo : ");
    Stream.iterate(2, i -> i * 2).limit(5).forEach(System.out::println);

    Stream<String> concatStream = Stream.concat(Stream.of("Optimus"), Stream.of("Prime"));
    System.out.println("concatStream Method Demo : " + concatStream.collect(Collectors.toList()));

  }

}