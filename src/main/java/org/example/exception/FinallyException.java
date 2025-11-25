package org.example.exception;

public class FinallyException {
    public static void main(String[] args) {

        try {
            System.out.println("in try block");
            throw new RuntimeException();

        }catch (Exception e){
            System.out.println("caught:"+e.getMessage());
        }finally {
            System.out.println("in finally block");
            throw new RuntimeException();
        }
    }
}
