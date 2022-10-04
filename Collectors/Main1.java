package StreamAPIJava8.Collectors;

import java.util.Set;
import java.util.stream.Collectors;

import static StreamAPIJava8.Collectors.Data.prepareTemperature;

//Transforms the input elements into a new Set and print a Collector.
public class Main1 {
    public static void main(String[] args) {
        Set<String> citySet = prepareTemperature().stream()
                .map(City::getCity)
                .collect(Collectors.toSet());
        citySet.forEach(System.out::println);
    }
}

