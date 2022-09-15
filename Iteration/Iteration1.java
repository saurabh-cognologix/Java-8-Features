package StreamAPIJava8.Iteration;

import java.util.ArrayList;
import java.util.List;


public class Iteration1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(300);
        list.add(200);
        list.add(400);
        list.add(500);


        System.out.println("------------Iterating by passing lambda expression--------------");
        list.forEach((n)-> System.out.println(n));


        System.out.println("------------Iterating by passing method reference---------------");
        list.forEach(System.out::println);


        System.out.println("------------Iterating by passing method reference(forEachOrdered)---------------");
        list.stream().forEachOrdered(System.out::println);


    }
}
