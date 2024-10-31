package fr.odevjava.whatsapp_clone_back.messaging.domain.message.aggregate;

import fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo.ConversationName;
import fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo.ConversationPublicId;
import fr.odevjava.whatsapp_clone_back.messaging.domain.user.aggregate.User;
import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;
import org.jilt.Builder;

import java.util.Set;

@Builder
public class Conversation {

    private final Set<Message> messages;

    private final Set<User> members;

    private final ConversationPublicId conversationPublicId;

    private final ConversationName conversationName;

    private Long dbId;

    public Conversation(Long dbId, ConversationName conversationName, ConversationPublicId conversationPublicId, Set<User> members, Set<Message> messages) {
        assertMandatoryFields(members, conversationName);
        this.dbId = dbId;
        this.conversationName = conversationName;
        this.conversationPublicId = conversationPublicId;
        this.members = members;
        this.messages = messages;
    }

    private void assertMandatoryFields(Set<User> users, ConversationName name) {
        Assert.notNull("users", users);
        Assert.notNull("name", name);
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public Set<User> getMembers() {
        return members;
    }

    public ConversationPublicId getConversationPublicId() {
        return conversationPublicId;
    }
}
