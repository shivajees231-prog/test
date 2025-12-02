package org.example.singletone;

import java.lang.reflect.Constructor;

public class Singletone {
private   static  Singletone instance;
    private Singletone(){

    }
    public static  synchronized Singletone getInstance(){
        if (instance==null){
            System.out.println("singletone eis dauwen");
            instance=new Singletone();


        }
        return instance;

    }
}
class  AppConfig{

    public static <Singleton> void main(String[] args) throws Exception{

        Singletone singletone=Singletone.getInstance();
        Singletone singletone1=Singletone.getInstance();

        System.out.println(singletone.hashCode());
        System.out.println(singletone1.hashCode());


        //Reflection Api
System.out.println("------------------------");
        Singletone s1=Singletone.getInstance();

        Constructor<Singleton> constructor = (Constructor<Singleton>) Singletone .class.getDeclaredConstructor();
        constructor.setAccessible(true); // bypass private access
        Singleton s2 = constructor.newInstance();

        System.out.println(s1.hashCode()); // e.g., 123456
        System.out.println(s2.hashCode()); // e.g., 654321 (different instance!)


    }
}