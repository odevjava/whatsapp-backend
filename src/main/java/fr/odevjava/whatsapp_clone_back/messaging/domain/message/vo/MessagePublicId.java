package fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo;

import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;

import java.util.UUID;

public record MessagePublicId(UUID value) {

    public MessagePublicId {
        Assert.notNull(value, "Id can't be null");
    }
}
