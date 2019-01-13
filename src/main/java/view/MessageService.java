package view;


import dao.SimpleStorage;
import model.Message;

import java.util.List;

public class MessageService {
    private SimpleStorage simpleStorage;


    public MessageService(SimpleStorage simpleStorage) {
        this.simpleStorage = simpleStorage;
    }

    public void addNewMessage(Message message){
        simpleStorage.addMessage(message);
    }

    public List<Message> messages() {
        return simpleStorage.getAll();
    }

    public void removeMessage(Message message) {
        simpleStorage.removeMessage(message);
    }
}


}
