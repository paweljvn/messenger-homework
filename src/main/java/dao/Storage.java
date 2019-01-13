package dao;

import model.Message;

import java.util.List;

public interface Storage {

    void addMessage(Message message);
    boolean removeMessage(Message message);
    void filterMessage(Message message);
    void displayMessage(Message message);
    List<Message> getAll();
}
