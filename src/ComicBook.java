import java.io.Serializable;

public class ComicBook implements Serializable {
    private String title;
    private int issue;
    private String author;
    private String artist;
    private double originalPrice;
    private String publisher;

    public ComicBook(String title, int issue, String author, String artist, double originalPrice, String publisher){
        this.title = title;
        this.issue = issue;
        this.author = author;
        this.artist = artist;
        this.originalPrice = originalPrice;
        this.publisher = publisher;
    }

    @Override
    public String toString(){

        return String.format("Title: %s\nIssue #: %d\nAuthor: %s\nArtist: %s\nOriginal Price : $%,.2f\nPublisher: %s\n",
                this.getTitle(), this.getIssue(), this.getAuthor(), this.getArtist(), this.getOriginalPrice(), this.getPublisher());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
