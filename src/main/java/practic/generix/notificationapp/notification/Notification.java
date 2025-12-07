package practic.generix.notificationapp.notification;

/**
 * Уведомления для пользователей
 */
public interface Notification {
    /**
     * @return форматированные тело сообщений
     */
    String formattedMessage();
}