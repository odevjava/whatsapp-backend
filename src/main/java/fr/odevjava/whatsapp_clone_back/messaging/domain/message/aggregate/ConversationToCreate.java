package fr.odevjava.whatsapp_clone_back.messaging.domain.message.aggregate;

import fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo.ConversationName;
import fr.odevjava.whatsapp_clone_back.messaging.domain.user.vo.UserPublicId;
import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;
import org.jilt.Builder;

import java.util.Set;

@Builder
public class ConversationToCreate {

    private final Set<UserPublicId> members;

    private final ConversationName name;

    public ConversationToCreate(Set<UserPublicId> members, ConversationName name) {
        assertMandatoryFields(members, name);
        this.members = members;
        this.name = name;
    }

    private void assertMandatoryFields(Set<UserPublicId> members, ConversationName name) {
        Assert.notNull("name",  name);
        Assert.notNull("members",  members);
    }

}
