package fr.odevjava.whatsapp_clone_back.messaging.domain.user.vo;

import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;

public record UserImageUrl(String value) {

    public UserImageUrl {
        Assert.field("value", value).maxLength(255);
    }
}
