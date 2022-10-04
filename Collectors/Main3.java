package StreamAPIJava8.Collectors;

import java.util.Map;
import java.util.stream.Collectors;

import static StreamAPIJava8.Collectors.Data.prepareTemperature;

public class Main3 {
    public static void main(String[] args) {
        Map<String,Double> tempMap = prepareTemperature()
                .stream()
                .filter(e->e.getTemp()>10)
                .collect(Collectors.toMap(
                        City::getCity,
                        City::getTemp,
                        (key,identicalkey)->key
                ));
        tempMap.forEach((k,v)-> System.out.println(k+"   :   "+v));
    }
}
