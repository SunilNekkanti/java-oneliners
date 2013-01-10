package com.aruld.oneliners;

import java.util.stream.Collectors;

import static java.util.stream.Streams.intRange;


/**
 * Multiple Each Item in a List by 2.
 */
public class Item1 {

  public static void main(String[] args) {
    // Range is half-open (exclusive) in Java, unlike Scala.
    intRange(1, 10).map(i -> i * 2).toArray();
    intRange(1, 10).map(i -> i * 2).boxed().collect(Collectors.<Integer>toList());
  }

}
