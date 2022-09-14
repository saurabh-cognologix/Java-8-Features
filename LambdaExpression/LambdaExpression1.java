package StreamAPIJava8.LambdaExpression;

/*
*  Lambda Expression consist of three things:
*  1:) Argument-list: It can be empty or non-empty as well.
*  2:) Arrow-token: It is used to link arguments-list and body of expression.
*  3:)Body: It contains expressions and statements for lambda expression.
*
* */
interface Drawable{
    public void draw();
}
public class LambdaExpression1 {
    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d=new Drawable(){
            public void draw(){
                System.out.println("Drawing "+width);
            }
        };
        d.draw();
    }

}
