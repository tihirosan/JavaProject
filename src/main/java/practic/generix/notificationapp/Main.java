package practic.generix.notificationapp;

import practic.generix.notificationapp.notification.EmailNotification;
import practic.generix.notificationapp.notification.PushNotification;
import practic.generix.notificationapp.notification.SmsNotification;
import practic.generix.notificationapp.notification_sender.EmailNotificationSender;
import practic.generix.notificationapp.notification_sender.SmsNotificationSender;
import practic.generix.notificationapp.notification_sender.PushNotificationSender;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<EmailNotification> email = List.of(
                new EmailNotification(
                        "Успешная регистрация!",
                        "Спасибо за регистрацию на сервисе!",
                        List.of("oleg@java.skillbox.ru", "masha@java.skillbox.ru", "yan@java.skillbox.ru")
                ),
                new EmailNotification(
                        "Распродажа в Steam!",
                        "Stellaris из вашего списка желаемого в Steam продаётся со скидкой!",
                        List.of("palyer@mail.ru", "player2@mail.ru")
                ),
                new EmailNotification(
                        "Запись на прием",
                        "Ваша запись на приём к врачу 05.05.2025 подтверждена.",
                        List.of("patient@mail.ru")
                )
        );
        List<SmsNotification> sms = List.of(
                new SmsNotification(
                        "Спасибо за регистрацию на сервисе!",
                        List.of("+70001234567")
                ),
                new SmsNotification(
                        "Внимание! Объявлена опасность БПЛА в воздушном пространстве Ленинградской области",
                        List.of("+1234567890", "+11111111111")
                ),
                new SmsNotification(
                        "- 300 руб. на заказ из ресторана до 30.05.2025",
                        List.of("+11122233445")
                )
        );


        List<PushNotification> push = List.of(
                new PushNotification(
                        "Успешная регистрация!",
                        "Спасибо за регистрацию на сервисе!",
                        "o.yanovich"
                ),
                new PushNotification(
                        "Заказ в пункте выдачи!",
                        "Ваш заказа в пункте выдачи ждет вас.",
                        "ozonclient"
                ),
                new PushNotification(
                        "Итоги 2025 года в Яндекс Музыке!",
                        "Распакуйте свой музыкальный мир!",
                        "yamusicclient"
                )
        );



        EmailNotificationSender emailSender = new EmailNotificationSender();
        SmsNotificationSender smsSender = new SmsNotificationSender();
        PushNotificationSender pushSender = new PushNotificationSender();


        emailSender.send(email);
        smsSender.send(sms);
        pushSender.send(push);
    }
}
