package StreamAPIJava8.SortAList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInReverseOrder {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("78", "a", "m", "b", "z", "c", "12", "l", "1");
        List<String> sortedListInReverseOrder = arrayList.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedListInReverseOrder.forEach(System.out::println);
    }
}
