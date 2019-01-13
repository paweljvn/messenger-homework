package model;

public class MessageBuilder {
    private String title;
    private String author;
    private String text;
    private String date;



    public MessageBuilder() {

    }

    public MessageBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public MessageBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public MessageBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public MessageBuilder withDate(String date) {
        this.date = date;
        return this;
    }

    public Message build() {
        Message message = new Message();
        message.setTitle(title);
        message.setAuthor(author);
        message.setText(text);
        message.setDate(date);

        return message;
    }
}
