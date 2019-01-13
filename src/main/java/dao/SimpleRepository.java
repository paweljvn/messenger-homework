package dao;

import model.Message;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SimpleRepository {

    // todo you should use interface as a type of field
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
        simpleStorage.filterMessage(message);
    }

    public void display(Message message) {
        simpleStorage.displayMessage(message);
    }


    // todo please analyze what I did here
    List<Message> findByTitle(final Message message) {
        return simpleStorage.getAll().stream()
                .filter(item -> item.getTitle().equals(message.getTitle()))
                .collect(toList());
    }
}
