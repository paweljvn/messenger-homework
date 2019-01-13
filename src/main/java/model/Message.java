package model;

public class Message {

    private String title;
    private String author;
    private String text;
    private String date;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("message's author=").append(author);
        sb.append(", text: ").append(text);
        sb.append(", date of: ").append(date);
        sb.append('}');
        return sb.toString();
    }


}
