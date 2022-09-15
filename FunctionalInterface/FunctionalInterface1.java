package StreamAPIJava8.FunctionalInterface;
/*
* Java Functional Interface :
* 1:- An Interface that contains exactly one abstract method is known as functional interface.
* 2:- It can have any number of default, static methods but can contain only one abstract method.
* 3:- It can also declare methods of object class.
* 4:- Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
* 5:- It is a new feature in Java, which helps to achieve functional programming approach.
 *
*
* */

@FunctionalInterface
interface sayable{
    void say(String msg);
}
public class FunctionalInterface1 implements sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterface1 obj = new FunctionalInterface1();
        obj.say("Hello There");
    }
}
