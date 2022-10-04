package StreamAPIJava8.Collectors;

import java.util.List;
import java.util.stream.Collectors;

import static StreamAPIJava8.Collectors.Data.prepareTemperature;

//we are trying to process the list of cities whose temperature is more than 10, and get only the city names.
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        List<String> cityList = prepareTemperature().stream()
                .filter(e->e.getTemp()>10)
                .map(City::getCity)
                .collect(Collectors.toList());
        cityList.forEach(System.out::println);

    }
}
