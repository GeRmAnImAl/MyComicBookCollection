import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Repository implements Serializable {
    private List<ComicBook> library;

    public Repository() {
        this.library = new ArrayList<>();
    }

    public void addComicBook(ComicBook comic) {
        this.library.add(comic);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (ComicBook comicBook : library) {
            stringBuilder.append(comicBook.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public List<ComicBook> getLibrary() {
        return library;
    }
}
