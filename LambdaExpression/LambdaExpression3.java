package StreamAPIJava8.LambdaExpression;
/*
* A lambda expression can have zero or any number of arguments.
*
* */

//   Java Lambda Expression Example: No Parameter
interface Sayable{
    public String say();
}
public class LambdaExpression3 {
    public static void main(String[] args) {
        Sayable s = () ->{
            return "I have nothing to say";
        };
        System.out.println(s.say());
    }
}
