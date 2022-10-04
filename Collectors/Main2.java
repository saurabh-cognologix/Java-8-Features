package StreamAPIJava8.Collectors;

import java.util.*;
import java.util.stream.Collectors;

import static StreamAPIJava8.Collectors.Data.prepareTemperature;

public class Main2 {
    public static void main(String[] args) {
        Collection<String> cityCollection = prepareTemperature().stream()
                .map(City::getCity)
                .collect(Collectors.toCollection(TreeSet::new));
        cityCollection.forEach(System.out::println);
    }
}
