package view;


import model.Message;

public class AddActionExecutor implements ActionExecutor {

    final MessageService messageService;
    final ApplicationMain.MessageProvider messageProvider;

    public AddActionExecutor(MessageService messageService, ApplicationMain.MessageProvider messageProvider) {
        this.messageService = messageService;
        this.messageProvider = messageProvider;
    }

    public void execute() {
        final Message message = messageProvider.fetchMessageFromUser();
        messageService.addNewMessage(message);
    }
}


