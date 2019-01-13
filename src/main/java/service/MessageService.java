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

    public boolean findByTitle(String title) {
        final List<Message> messagesWithSameTitle =
                messageRepository.findByTitle(title);



    }
}
