package StreamAPIJava8.SortAList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
* 1) The reverseOrder() is a method of Comparator interface which is defined in java.util package.
* 2) The method returns a comparator that imposes the reverse of the natural ordering.
* 3) It throws NullPointerException when comparing null.
* */

public class SortingInReverseOrder {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("78", "a", "m", "b", "z", "c", "12", "l", "1");
        List<String> sortedListInReverseOrder = arrayList.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedListInReverseOrder.forEach(System.out::println);
    }
}
