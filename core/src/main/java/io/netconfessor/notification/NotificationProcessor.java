package io.netconfessor.notification;

import io.netconfessor.Element;

public interface NotificationProcessor {
    boolean process(Element element);
}
