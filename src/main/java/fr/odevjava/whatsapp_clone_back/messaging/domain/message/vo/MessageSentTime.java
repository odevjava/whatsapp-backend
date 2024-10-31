package fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo;

import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
