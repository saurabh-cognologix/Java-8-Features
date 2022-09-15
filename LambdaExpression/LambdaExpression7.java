package StreamAPIJava8.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpression7 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Dairy Milk",1000));
        list.add(new Product(2,"Kit kat",5000));
        list.add(new Product(3,"Hershey's Milk",8000));
        list.add(new Product(4,"Dairy Milkk",1000));

        System.out.println("Sorting on the basis of name...");
        //sorting on the basis of
        // implementing lambda expression
        Collections.sort(list,(p1, p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
