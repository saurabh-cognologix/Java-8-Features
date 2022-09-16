package StreamAPIJava8.Stream;
//Java Stream Iterating Example
/*
* You can use stream to iterate any number of times.
* Stream provides predefined methods to deal with the logic you implement.
*
*
* */
import java.util.HashMap;
import java.util.*;
public class Stream3 {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("Maths",96);
        hm.put("English",56);
        hm.put("Hindi",53);
        hm.put("Physics",89);

        hm.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
