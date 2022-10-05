package StreamAPIJava8.SortAList;

import java.util.Arrays;
import java.util.List;

public class SortingInCaseInsensitiveOrder {
    public static void main(String[] args) {
        List<String> country = Arrays.asList("Russia","india", "China", "Japan", "", "ghana");
        country.sort(String.CASE_INSENSITIVE_ORDER);
        country.forEach(System.out::println);

    }
}
/*
*  OutPut:
*   China
    ghana
    india
    Japan
    Russia
*
*
*
* */
