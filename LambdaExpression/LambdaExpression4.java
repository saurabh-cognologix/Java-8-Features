package StreamAPIJava8.LambdaExpression;
/*
* Java Lambda Expression Example: Single Parameter
*
* */

interface Sayable1{
    public String say(String name);
}
public class LambdaExpression4 {
    public static void main(String[] args) {
        // lambda expression with sigle parameter
        Sayable1 s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("Abcdef"));

        // You can omit function parentheses
        Sayable1 s2= name ->{
            return "Hello, "+name;
        };
        System.out.println(s2.say("Xyz"));
    }
}
