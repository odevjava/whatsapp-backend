package fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo;

import java.awt.*;

public record MessageContent(String text, TrayIcon.MessageType type, MessageMediaContent media) {
}
