package StreamAPIJava8.SortAList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NaturalOrderSorting {
    public static void main(String[] args) {
        List<String> country = Arrays.asList("Russia","india", "China", "Japan", "", "ghana");
        country.sort(Comparator.naturalOrder());
        country.forEach(System.out::println);
    }
}
