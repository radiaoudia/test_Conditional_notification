package com.example.test_notification.business;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix="notif", name="methode", havingValue="email")
public class EmailNotificationService implements INotification {
    @Override
    public void notifier(String message) {
        System.out.println("notification via Email");
    }


}
