package StreamAPIJava8.LambdaExpression;


import java.util.ArrayList;
import java.util.List;

// Java Lambda Expression Example: Foreach Loop
public class LambdaExpression6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.add("IJK");

        System.out.println(list); //[ABC, DEF, GHI, IJK]

        list.forEach((n)-> System.out.println(n));
    }
}