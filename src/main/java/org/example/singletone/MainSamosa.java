package org.example.singletone;

public class MainSamosa {
    public static void main(String[] args) {

        Samosa samosa=Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa samosa1=Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
    }
}
