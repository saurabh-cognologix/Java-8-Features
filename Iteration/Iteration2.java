package StreamAPIJava8.Iteration;

import java.util.HashMap;
import java.util.Map;

public class Iteration2 {
    public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<>();
        marks.put("English",80);
        marks.put("Science",85);
        marks.put("Hindi",82);
        marks.put("Physics",52);


        // forEach(action) method to iterate map
        // 1.
        marks.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));

        //2.
        marks.forEach((k,v)-> System.out.println(k+ "     " +v));
    }
}
