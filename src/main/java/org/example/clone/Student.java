package org.example.clone;

public class Student implements Cloneable{

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

   public Object clone() throws CloneNotSupportedException{

       return super.clone();
    }


}
class  Main{

    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1=new Student(101,"Shivajee");
        Student s2=(Student) s1.clone();

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}