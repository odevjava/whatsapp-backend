package fr.odevjava.whatsapp_clone_back.messaging.domain.user.vo;

import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
