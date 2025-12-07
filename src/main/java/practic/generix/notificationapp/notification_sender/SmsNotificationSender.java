package practic.generix.notificationapp.notification_sender;

import java.util.List;

import practic.generix.notificationapp.notification.SmsNotification;

public class SmsNotificationSender implements NotificationSender<SmsNotification> {

    @Override
    public void send(List<SmsNotification> notifications) {
        for (SmsNotification notification : notifications) {
            send(notification);
        }
    }
    @Override
    public void send(SmsNotification notification) {
        System.out.println("SMS");
        System.out.println("listNumbers: " + String.join(", ", notification.getListNumbers()));
        System.out.println("text: " + notification.formattedMessage());
        System.out.println();
    }


}
