package com.cyl.lamda;

import java.util.*;
import java.util.function.Consumer;

class Product implements /*Comparable<Product>*/ Comparator<Product>{
    int id;
    String name;
    double price;
    public Product(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compare(Product o1, Product o2) {
       if(o1.price> o2.price){
           return -1;
       }else if(o1.price<o2.price){
           return 1;
       }else{
           return 0;
       }
    }

    /*@Override
    public int compareTo(Product o) {
        if(this.price>o.price){
            return 1;
        } else if (this.price<o.price) {
            return -1;
        }else {
            return 0;
        }

    }*/


}

public class LamdaDemo {
    static String str;
    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));
     // list.forEach();
       // Collections.sort(list,list.get(1).name.compareTo());
        int a;
        //System.out.println(a);
        System.out.println(str);

    }
}
