package dao;

import model.Message;

import java.util.List;

public interface MessageRepository {

    void add(Message message);

    boolean remove(Message message);

    void filter(Message message);

    void display(Message message);

    List<Message> getAll();

    List<Message> findByTitle(String title);

    List<Message> findByAuthor(String author);
}
