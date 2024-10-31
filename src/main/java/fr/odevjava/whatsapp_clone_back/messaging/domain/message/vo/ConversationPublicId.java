package fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo;

import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;

import java.util.UUID;

public record ConversationPublicId(UUID value) {

    public ConversationPublicId {
        Assert.notNull(value, "conversation not be null");
    }
}
