package fr.odevjava.whatsapp_clone_back.messaging.domain.message.aggregate;

import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;
import org.hibernate.validator.cfg.defs.AssertFalseDef;

import java.util.List;

public record Messages(List<Messages> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
