package StreamAPIJava8.Stream;


import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

//Filterring the number that is greater than 300
/*
* Java provides a new method forEach() to iterate the elements
* */
public class Stream1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(100);
        list.add(300);
        list.add(200);
        list.add(400);
        list.add(500);
        List<Integer> newList = list.stream().filter(p->(p>300)).collect(Collectors.toList());
        System.out.println("------------Iterating by passing lambda expression--------------");
        newList.forEach((n)-> System.out.println(n));
        System.out.println("------------Iterating by passing method reference---------------");
        newList.forEach(System.out::println);
    }
}
