package practic.generix.notificationapp.notification;
import java.util.List;
import lombok.*;
@AllArgsConstructor
@Getter

public class EmailNotification implements Notification {

    private String topic; //тема сообщения
    private String text; //текст сообщения
    private List<String> listAddress; //список адресов получателей

    @Override
    public String formattedMessage() {
        return "<p>" + text + "</p>";
    }



}

