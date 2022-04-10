package com.java8.predicate;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

// Takes argument and return boolean
// One abstract, 3 default, 2 static method
// Use in conditional programming
public class PredicateDemoApplication {

  public static void main(String[] args) {

    int[] x = {0,5,10,15,20,25,30};
    Predicate<Integer> predicate1 = i->i>10;
    Predicate<Integer> predicate2 = i->i%2==0;
    Predicate<Integer> predicate4 = Predicate.not(predicate1);

    System.out.println("Predicate method test method : "+ predicate1.test(100));
    System.out.println("Predicate method not method : " +predicate4.test(100));

    System.out.println("Predicate and method demo : ");
    method1(predicate1.and(predicate2), x);

    System.out.println("Predicate or method demo: ");
    method1(predicate1.or(predicate2), x);

    System.out.println("Predicate negate method demo: ");
    method1(predicate1.negate(), x);


    Predicate<Integer> predicate3 = Predicate.isEqual(10);
    System.out.println("Predicate isEqual method demo : " +predicate3.test(5));
    System.out.println("Predicate isEqual method demo : " +predicate3.test(10));

    Predicate<User> predicateUser = u -> u.getUser().equals("anu") && u.getPassword().equals("pass");

    User user1 = new User("anu","pass");
    User user2 = new User("anu","demo");

    System.out.println("Authenticate User One : " +predicateUser.test(user1));
    System.out.println("Authenticate User Two : " +predicateUser.test(user2));

    BiPredicate<Integer, Integer> biPredicate1 = (a,b) -> a>b;
    System.out.println("BiPredicate demo : " +biPredicate1.test(10, 4));

    IntPredicate intPredicate = i -> i>10;
    System.out.println("IntPredicate demo : " +intPredicate.test(100));


  }

  public static void method1(Predicate<Integer> p, int[] x) {
    for(int x1 : x){
      if(p.test(x1))
        System.out.println(x1);
    }
  }
  }


  class User {

  private String user;
  private String password;

  public User (String user, String password) {
    this.user = user;
    this.password = password;
  }

    public String getUser() {
      return user;
    }

    public String getPassword() {
      return password;
    }
  }