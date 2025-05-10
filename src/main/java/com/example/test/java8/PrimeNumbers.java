package com.example.test.java8;

import java.util.stream.IntStream;

public class PrimeNumbers {

    public static void main(String[] args) {
        //IntStream.rangeClosed(1,100).filter(PrimeNumbers::isPrime).forEach(n -> System.out.print( n+ " "));



       /* IntStream.rangeClosed(1, 100)
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .allMatch(i -> n % i != 0))
                .forEach(System.out::println);*/

        IntStream.rangeClosed(1,100).filter(n-> n>1 && IntStream.rangeClosed(2, n/2).allMatch(i -> n%i != 0)).forEach(System.out::print);

        IntStream.rangeClosed(1,100).filter(n-> n> 1 && IntStream.rangeClosed(2, n/2).allMatch(i -> n%i != 0)).forEach(System.out::println);

    }

    private static boolean isPrime(int num) {
        if(num<2)
            return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).parallel().noneMatch(i -> num%2 ==0);
    }
}
