package view;

import com.sun.tools.javac.util.StringUtils;
import model.Message;

import java.util.List;
import java.util.Scanner;

public class FilterMessage {

    public class FilterMessage {

        Scanner scanner = new Scanner(System.in);

        public List<Message> filterByTitle(List<Message> listToFilter, FilterMethodsStorage filterMessageStorage) {

            String title;

            do {
                System.out.println("Give title:");
                title = scanner.nextLine();
            }
            while (StringUtils.isBlank(title));
            return filterMessageStorage.filterByTitle(title, listToFilter);
        }

        public List<Message> filterByAuthor(List<Message> listToFilter, FilterMethodsStorage filterMessageStorage) {

            String author;

            do {
                System.out.println("Give author: ");
                author = scanner.nextLine();
            }
            while (StringUtils.isBlank(author));
            return filterMessageStorage.filterByAuthor(author, listToFilter);
        }

        public List<Message> filterByContent(List<Message> listToFilter, FilterMethodsStorage filterMessageStorage) {

            String content;

            do {
                System.out.println("Give content:");
                content = scanner.nextLine();
            }
            while (StringUtils.isBlank(content));
            return filterMessageStorage.filterByContent(content, listToFilter);
        }

        public List<Message> filterByDate(List<Message> listToFilter, FilterMethodsStorage filterMessageStorage) {

            String dateAndTitle;

            do {
                System.out.println("Insert date:");
                dateAndTitle = scanner.nextLine();
            }
            while (StringUtils.isBlank(dateAndTitle));
            return filterMessageStorage.filterByDate(dateAndTitle, listToFilter);
        }

    }
}
