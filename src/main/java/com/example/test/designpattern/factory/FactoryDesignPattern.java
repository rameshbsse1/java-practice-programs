package com.example.test.designpattern.factory;

public class FactoryDesignPattern {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotificationType("sms");
        notification.sendNotification();

        Notification notification1 = NotificationFactory.createNotificationType("email");
        notification1.sendNotification();
    }
}
