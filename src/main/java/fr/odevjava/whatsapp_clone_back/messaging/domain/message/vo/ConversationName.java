package fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo;

import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);


    }
}
