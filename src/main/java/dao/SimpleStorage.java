package dao;

import model.Message;

import java.util.ArrayList;
import java.util.List;

public class SimpleStorage implements Storage {
    private final List<Message> storage = new ArrayList<>();

    public void addMessage(final Message message) {
        if (message == null) {
            throw new RuntimeException();
        }
        storage.add(message);
    }

    public boolean removeMessage(final Message message) {
        return storage.remove(message);
    }

    @Override
    public void filterMessage(Message message) {

    }

    @Override
    public void displayMessage(Message message) {

    }


    public List<Message> getAll() {
        final ArrayList<Message> messages = new ArrayList<>();
        messages.addAll(storage);
        return messages;
    }
}
