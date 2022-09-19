package StreamAPIJava8.Stream;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

/*
* Summing method in Java 8
* 1)summingInt()
* 2)summingDouble()
* 3)summingLong()
* */
public class Stream5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,15,10,5,20);
        Integer sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum = "+sum);
    }
}
