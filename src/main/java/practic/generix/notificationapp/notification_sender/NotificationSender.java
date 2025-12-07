package practic.generix.notificationapp.notification_sender;

import practic.generix.notificationapp.notification.Notification;

import java.util.List;

/**
 * Сервис по отправке уведомлений
 *
 * @param <T> Вид отправляемого уведомления
 */
public interface NotificationSender<T extends Notification> {

    /**
     * Отправить одно уведомление
     *
     * @param notification уведомление
     */
    void send(T notification);

    /**
     * Отправка множества уведомлений
     *
     * @param notifications список уведомлений
     */
    void send(List<T> notifications);
}

