import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    ComicBook spiderman = new ComicBook("Spiderman", 1, "Stan Lee", "Stan Less", 0.35,
            "Marvel", 1);
    ComicBook spiderman2 = new ComicBook("Spiderman", 2, "Stan Lee", "Stan Less", 0.35,
            "Marvel", 1);
    Repository library = new Repository();

    @Test
    void addComicBook() {
        // Verify the library is empty
        assertThrows(IndexOutOfBoundsException.class, () -> library.getLibrary().get(0));

        // Add a comicBook object to the Repository object & verify it was added
        library.addComicBook(spiderman);
        assertEquals(spiderman, library.getLibrary().get(0));


    }

    @Test
    void testToString() {
        library.addComicBook(spiderman);
        library.addComicBook(spiderman2);
        System.out.println(library.toString());
    }
}