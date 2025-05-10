package com.example.test.designpattern.SingletonDP;

// Example: Logger class as a Singleton
public class Logger {
    private static Logger instance;

    private Logger() {
        // Private constructor to prevent external instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

// Usage
//Logger.getInstance().log("Application started");