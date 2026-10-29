package com.spring.boot.coupling;

/**
 * Loose coupling means that a class depends on an abstraction (an interface)
 * instead of directly depending on one concrete class.
 *
 * NotificationService only knows about MessageSender. We can pass an email
 * sender, an SMS sender, or another sender without changing NotificationService.
 */
public class LooselyCoupledExample {

    public static void main(String[] args) {
        // The dependency is created outside NotificationService.
        MessageSender emailSender = new EmailMessageSender();
        NotificationServiceWithDependencyInjection notificationService =
                new NotificationServiceWithDependencyInjection(emailSender);

        notificationService.sendNotification("Welcome to loose coupling!");

        // The same notification service can use a different implementation.
        MessageSender smsSender = new SmsMessageSender();
        NotificationServiceWithDependencyInjection smsNotificationService =
                new NotificationServiceWithDependencyInjection(smsSender);

        smsNotificationService.sendNotification("This message uses SMS.");
    }
}

/**
 * An interface describes what a sender can do without specifying how it does it.
 */
interface MessageSender {

    void sendMessage(String message);
}

/**
 * One implementation of the MessageSender interface.
 */
class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

/**
 * Another implementation. This can be added without modifying the service.
 */
class SmsMessageSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

/**
 * The dependency is supplied through the constructor.
 * This technique is called constructor dependency injection.
 */
class NotificationServiceWithDependencyInjection {

    private final MessageSender messageSender;

    NotificationServiceWithDependencyInjection(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}
