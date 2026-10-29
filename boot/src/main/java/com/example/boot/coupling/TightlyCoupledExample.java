package com.spring.boot.coupling;

/**
 * Tight coupling means that one class directly creates and depends on a
 * specific implementation of another class.
 *
 * In this example, NotificationService creates EmailService itself.
 * Therefore, changing the notification method requires changing
 * NotificationService.
 */
public class TightlyCoupledExample {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Welcome to Java coupling!");
    }
}

/**
 * This class knows exactly which service it must use.
 */
class NotificationService {

    private final EmailService emailService = new EmailService();

    void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}

/**
 * A concrete email implementation.
 */
class EmailService {

    void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }
}