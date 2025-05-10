package com.example.test.designpattern.factory;

public class NotificationFactory {

    public static Notification createNotificationType(String type) {

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            default -> throw new IllegalArgumentException("unknown type" + type);
        };
    }
}
