package org.example.facotry.impl;

import org.example.facotry.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("sending email notification");
    }
}
class SMSNotification implements Notification{


    @Override
    public void notifyUser() {
        System.out.println("sending SMS Notification");

    }
}
class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("sending a push Notification");

    }
}
class  NotificationFactory{



    public  Notification createNotification(String type){
        if (type==null || type.isEmpty())return null;
        switch (type.toLowerCase()){
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw  new IllegalArgumentException();
        }
    }
}
class MainNotification{

    public static void main(String[] args) {

        NotificationFactory factory=new NotificationFactory();
        Notification notification=factory.createNotification("email");

        notification.notifyUser();

    }
}