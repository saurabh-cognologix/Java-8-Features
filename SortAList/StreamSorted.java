package StreamAPIJava8.SortAList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("78", "a", "m", "b", "z", "c", "12", "l", "1");
        List<String> sortedList = arrayList.stream()
                .sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

    }
}
