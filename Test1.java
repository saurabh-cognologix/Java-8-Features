package StreamAPIJava8;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Test1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        for (int i = 0; i < 6; i++) {
            System.out.println(values.get(i)); //1 2 3 4 5 6
        }
        */

       /*
       Iterator<Integer> it = values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());  //1 2 3 4 5 6
        }
        */
/*
       for(int i : values) {
            System.out.println(i);  // 1 2 3 4 5 6
        }
       */


        //using stream api
        values.forEach(i-> System.out.println(i)); // 1 2 3 4 5 6
    }
}