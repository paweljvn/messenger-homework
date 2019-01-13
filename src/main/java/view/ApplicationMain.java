package view;

import dao.MessageRepository;
import dao.SimpleRepository;
import dao.SimpleRepositoryToMessageRepositoryAdapter;
import dao.SimpleStorage;
import sun.java2d.pipe.SpanShapeRenderer;


import javax.swing.*;
import java.awt.*;
import java.util.Optional;
import java.util.Scanner;

public class ApplicationMain {
    public final static String NULL = null;


    public static void main(String[] args) {


        final SimpleRepository simpleRepository = new SimpleRepository(new SimpleStorage());
        final MessageRepository messageRepository = new SimpleRepositoryToMessageRepositoryAdapter(simpleRepository);


        mainLoop:
        while (true) {
            System.out.println("Choose the action:");
            System.out.println("1: Add a message.");
            System.out.println("2: Remove a message.");
            System.out.println("3: Display all messages.");
            System.out.println("4: Find by title.");
            System.out.println("5: Find by author.");
            System.out.println("6: Exit the application.");
            System.out.println();

            Scanner scanner = new Scanner(System.in);

            final int selectedAction = scanner.nextInt();

            final Optional<Desktop.Action> action = Action.fromActionIndex(selectedAction);

            if (action.isPresent()) {
                switch (action.get()) {
                    case ADD:
                        //add a message

                    case REMOVE:
                        // remove a meesage

                    case DISPLAY_ALL_MESSAGES:
                        // display all...

                    case SEARCH_BY_TITLE:
                        // searching by title

                    case SEARCH_BY_AUTHOR:
                        // searching by author

                    case CLOSE:
                        break mainLoop;

                    default:
                        continue mainLoop;
                }
            } else {
                System.out.println("Incorrect type of action.");
            }
        }
    }





}
