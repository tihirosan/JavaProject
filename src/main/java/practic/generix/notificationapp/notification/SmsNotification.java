package practic.generix.notificationapp.notification;

import java.util.List;
import lombok.*;
@AllArgsConstructor
@Getter

public class SmsNotification implements Notification {

    private String  text; //текст сообщения
    private List<String> listNumbers; //список телефонных номеров получателей

    @Override
    public String formattedMessage() {
        return text;
    }


}

