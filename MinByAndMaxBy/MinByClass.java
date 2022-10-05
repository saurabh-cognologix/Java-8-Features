package StreamAPIJava8.MinByAndMaxBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.minBy;

public class MinByClass {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(10,55,3,96,45,145,5);
        Optional<Integer> smallestNumber = arrayList.stream().min(Integer::compareTo);
        System.out.println(smallestNumber.get());

    }
}
