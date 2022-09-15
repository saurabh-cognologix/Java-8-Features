package StreamAPIJava8.LambdaExpression;

//   Java Lambda Expression Example
interface Drawable1{
    public void draw();
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        int width=123;

        //with lambda
        Drawable1 d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }
}