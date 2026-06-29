package wrapper_classes_generics.homework12;

public class Comment {
    private String author;
    private String text;
    private int countLikes;

    public Comment(String author, String text, int countLikes) {
        this.author = author;
        this.text = text;
        this.countLikes = countLikes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    @Override
    public String toString() {
        return author + "#" + text + "#" + countLikes;
    }
}
