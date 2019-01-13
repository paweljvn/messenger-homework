package view;

import dao.SimpleStorage;
import service.MessageService;
import java.util.Optional;
import java.util.Scanner;

import static java.util.Optional.empty;
import static java.util.Optional.of;


public class ApplicationMain {
    public final static String NULL = null;

    public enum Action {

        ADD(1),
        REMOVE(2),
        SHOW(3),
        FILTER(4),
        CLOSE(5);

        private final int actionIndex;

        Action(final int actionIndex) {
            this.actionIndex = actionIndex;
        }

        public static Optional<Action> fromActionIndex(int actionIndex) {
            for (Action action : Action.values()) {
                if (action.actionIndex == actionIndex) {
                    return of(action);
                }
            }
            return empty();
        }

    }

    public static void main(String[] args) {
        final SimpleStorage simpleStorage = new SimpleStorage();
        final MessageService messageService = new MessageService(simpleStorage);
        final MessageProvider messageProvider = new MessageProvider();
        final FilterMessage filterMessage = new FilterMessage();

        mainLoop:
        while (true) {

            System.out.println("Choose action:" + "\n" +
                    "1: Add message" + "\n" +
                    "2: Remove message" + "\n" +
                    "3: Show message" + "\n" +
                    "4: Filter of message" + "\n" +
                    "5: Close application");
            System.out.println();

            Scanner scanner = new Scanner(System.in);

            final int selectedAction = scanner.nextInt();
            final Optional<Action> action = Action.fromActionIndex(selectedAction);

            if (action.isPresent()) {
                switch (action.get()) {
                    case ADD:
                        new AddActionExecutor(messageService, messageProvider).execute();
                        break;
                    case REMOVE:
                        new RemoveActionExecutor(messageService, messageProvider).execute();
                        break;
                    case DISPLAY_ALL_MESSAGES:
                        new ShowActionExecutor(messageService).execute();
                        break;
                    case FILTER:
                        new FilterActionExecutor(messageService, filterMessage).execute();
                        break;
                    case CLOSE:
                        break mainLoop;
                    default:
                        continue mainLoop;
                }
            } else {
                System.out.println("Wrong choice, try again!");
            }
        }
    }

    private static class MessageProvider {
    }

    private static class FilterMessage {
    }
}





}
