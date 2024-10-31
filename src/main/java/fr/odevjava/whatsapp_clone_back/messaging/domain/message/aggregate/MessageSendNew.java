package fr.odevjava.whatsapp_clone_back.messaging.domain.message.aggregate;

import fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo.ConversationPublicId;
import fr.odevjava.whatsapp_clone_back.messaging.domain.message.vo.MessageContent;

public record MessageSendNew(MessageContent messageContent, ConversationPublicId conversationPublicId) {
}
