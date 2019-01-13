package service;

import dao.MessageRepository;
import model.Message;

import java.util.List;

public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(final MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public boolean addIfNotExists(Message message) {
        if (isMessageInRepository(message)) {
            return false;
        }

        messageRepository.add(message);
        return true;
    }

    // todo this method is useless I guess
    public boolean findByTitle(String title) {
        final List<Message> messagesWithSameTitle =
                messageRepository.findByTitle(title);
        // todo just to make it build
        return false;
    }

    private boolean isMessageInRepository(Message message) {
        // todo I made it like this just to make build but it is not a good way to achieve
        // the goal of this method. You should think about it.
        List<Message> foundMessages = this.messageRepository.findByTitle(message.getTitle());

        return !foundMessages.isEmpty();
    }
}
