package practic.generix.notificationapp.notification_sender;


import practic.generix.notificationapp.notification.EmailNotification;

import java.util.List;

public class EmailNotificationSender implements NotificationSender<EmailNotification> {


    @Override
    public void send(List<EmailNotification> notifications) {
        for (EmailNotification notification : notifications) {
            send(notification);
        }
    }

    @Override
    public void send(EmailNotification notification) {
        System.out.println("EMAIL");
        System.out.println("topic: " + notification.getTopic());
        System.out.println("listAddress: " + String.join(", ", notification.getListAddress()));
        System.out.println("text: " + notification.formattedMessage());
        System.out.println();
    }


}
