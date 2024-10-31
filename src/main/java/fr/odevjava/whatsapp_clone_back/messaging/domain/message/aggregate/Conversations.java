package fr.odevjava.whatsapp_clone_back.messaging.domain.message.aggregate;

import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }

}
