package org.example.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    Integer age;
    Student(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public String toString(){
        return name+":"+age;
    }
}
 class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        int nameCompare=s1.getName().compareTo(s2.getName());
        int ageCompare=s1.getAge().compareTo(s2.getAge());
        return( nameCompare==0) ? ageCompare :nameCompare;
    }
}
public class CompraterTest {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Amit",32));
        students.add(new Student("Monisha",22));
        students.add(new Student("Sonali",48));
        students.add(new Student("Ahaani",28));
        System.out.println("original list");
        for (Student s:students){
            System.out.println(s);
        }
        Collections.sort(students, new StudentComparator());
        System.out.println("\nofter sorting");
        for (Student s:students){
        System.out.println(s);

        System.out.println("==============");

       List<Student> ageCompare= students.stream().filter(student -> student.age<=28).collect(Collectors.toList());

       System.out.println(ageCompare);
}
    }
}
