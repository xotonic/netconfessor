package io.netconfessor.notification;

import io.netconfessor.Element;

public class SystemNotificationProcessor implements NotificationProcessor {
    @Override
    public boolean process(Element element) {
        System.err.println("Notification: " + element);
        return true;
    }
}
