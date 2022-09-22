package StreamAPIJava8.Iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Physics",92);
        marks.put("Chemistry",89);
        marks.put("Maths",86);
        marks.put("English",89);
        marks.put("Physical Education",92);

                     /* Iteration using for Each (Java 8)*/
        // 1.
        marks.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));

        //2.
        marks.forEach((k,v)-> System.out.println(k+ "     " +v));

                /*     Iterating over Map.entrySet() using For-Each loop  */


               /*       Iterating using iterators over Map.Entry<K, V>      */
        // 4.
        Iterator<Map.Entry<String, Integer>> itr = marks.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        //5.
        // using keySet() for iteration over keys
        for (String subject : marks.keySet())
            System.out.println("key: " + subject);

        // using values() for iteration over values
        for (Integer mark : marks.values())
            System.out.println("valueee: " + mark);

    }
}
