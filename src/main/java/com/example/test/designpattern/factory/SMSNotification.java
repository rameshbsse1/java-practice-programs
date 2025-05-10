package com.example.test.designpattern.factory;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sending as sms notification");
    }

}
