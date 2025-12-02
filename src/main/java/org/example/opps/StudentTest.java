package org.example.opps;

import java.util.Arrays;


class  Book{

    long price;
    String name;

    public Book(int i, String java) {
        this.price=100;
        this.name="maths";
    }

    public void bookmethod(){
        System.out.println("this is boot class");
    }

}

public class StudentTest {

    public static void main(String[] args) {
        Book book=new Book(1000,"microservice");
       /* book.price=1300;
        book.name="spring";*/







        System.out.println(book.price+" "+book.name);
    }
}
