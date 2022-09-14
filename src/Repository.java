import javax.swing.text.html.HTMLDocument;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repository implements Serializable {
    private List<ComicBook> library;

    public Repository(){
        this.library = new ArrayList<>();
    }

    public void addComicBook(ComicBook comic){
        this.library.add(comic);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        Iterator iterator = library.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toString());
        }
        return stringBuilder.toString();
    }

}
