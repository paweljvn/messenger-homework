package dao;


import model.Message;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleRepositoryToMessageRepositoryAdapter implements MessageRepository {
    private final SimpleRepository simpleRepository;

    public SimpleRepositoryToMessageRepositoryAdapter(final SimpleRepository simpleRepository) {
        this.simpleRepository = simpleRepository;
    }

    @Override
    public void add (final Message message) {
        simpleRepository.add(message);
    }

    @Override
    public boolean remove(final Message message) {
        return simpleRepository.remove(message);
    }

    @Override
    public void filter (final Message message) {
      simpleRepository.filter(message);
    }

    @Override
    public void display (final Message message) {
        simpleRepository.display(message);
    }

    @Override
    public List<Message> getAll() {
        return null;
    }

    @Override
    public List<Message> findByTitle(final String title) {
        return getAll().stream()
                .filter(item -> item.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    @Override
    public List<Message> findByAuthor(String author) {
        return null;
    }


}
