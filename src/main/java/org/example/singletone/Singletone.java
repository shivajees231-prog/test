package org.example.singletone;

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

    public static void main(String[] args) {

        Singletone singletone=Singletone.getInstance();
        Singletone singletone1=Singletone.getInstance();

        System.out.println(singletone.hashCode());
        System.out.println(singletone1.hashCode());

    }
}