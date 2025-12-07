package practic.generix.notificationapp.notification_sender;

import practic.generix.notificationapp.notification.PushNotification;

import java.util.List;

public class PushNotificationSender implements NotificationSender<PushNotification> {


    @Override
    public void send(List<PushNotification> notifications) {
        for (PushNotification notification : notifications) {
            send(notification);
        }
    }

    @Override
    public void send(PushNotification notification) {
        System.out.println("PUSH");
        System.out.println("title: " + notification.getTitle());
        System.out.println("userAccount: " + notification.getUserAccount());
        System.out.println("text: " + notification.formattedMessage());
        System.out.println();
    }


}

