package dao;

import model.Message;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SimpleRepository {
    private final SimpleStorage simpleStorage;

    public SimpleRepository(final SimpleStorage simpleStorage) {
        this.simpleStorage = simpleStorage;
    }

    public void add(Message message) {
        simpleStorage.addMessage(message);
    }

    boolean remove (Message message) {
        return simpleStorage.removeMessage(message);
    }

    public void filter(Message message) {
        return simpleStorage.filter(message);
    }

    public void display(Message message) {
        return simpleStorage.display(message);
    }


    List<Message> findByTitle(final Message message) {
        return simpleStorage.getAll().stream()
                .filter(item -> item.getMessage() = messageAuthor)
                .collect(toList());
    }
}
