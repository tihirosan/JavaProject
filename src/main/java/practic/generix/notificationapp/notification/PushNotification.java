package practic.generix.notificationapp.notification;

import lombok.*;
@AllArgsConstructor
@Getter

public class PushNotification implements Notification {
    private static final String EMOJI = "👋";

    private String title; //заголовок уведомления
    private String text; //текст сообщения
    private String userAccount; //аккаунт пользователя


    @Override
    public String formattedMessage() {
        return EMOJI + " " + text;

    }


}