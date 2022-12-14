package StreamAPIJava8.LambdaExpression;

//Java Lambda Expression Example: Multiple Parameters
interface Addable{
    int add(int a,int b);
}
public class LambdaExpression5 {
    public static void main(String[] args) {
        Addable ad1 = (a,b) ->{
            return a+b;
        };
        System.out.println(ad1.add(5,10));

        // Multiple parameters with data type in lambda expression
        Addable ad2=(int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));
    }
}
