package com.example.test.designpattern.factory;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Email notification sent successfully");
    }

}
