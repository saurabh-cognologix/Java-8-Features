package StreamAPIJava8.LambdaExpression;

/*
* Why use Lambda Expression
*  1) To provide the implementation of Functional interface.
*  2) Less coding.
*
* Functional Interface :
* --> A functional interface is an interface that contains only one abstract method.
* --> They can have only one functionality to exhibit.
* --> From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
* --> A functional interface can have any number of default methods.
*
*
*
* */

/*
*  Syntax :  (argument-list) -> {body}
*  Lambda Expression consist of three things:
*  1:) Argument-list: It can be empty or non-empty as well.
*  2:) Arrow-token: It is used to link arguments-list and body of expression.
*  3:)Body: It contains expressions and statements for lambda expression.
*
* */

//      Implementing an interface without using lambda expression.
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
