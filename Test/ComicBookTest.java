import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComicBookTest {
    ComicBook spiderman = new ComicBook("Spiderman", 1, "Stan Lee", "Stan Less", 0.35,
            "Marvel", 1);

    @Test
    void testToString() {
        assertEquals("""
                Title: Spiderman
                Issue #: 1
                Author: Stan Lee
                Artist: Stan Less
                Original Price : $0.35
                Publisher: Marvel
                Number of Copies: 1""", spiderman.toString());
    }

    @Test
    void getTitle() {
        assertEquals("Spiderman", spiderman.getTitle());
    }

    @Test
    void setTitle() {
        spiderman.setTitle("The Amazing Spider-Man");
        assertEquals("The Amazing Spider-Man", spiderman.getTitle());
    }

    @Test
    void getIssue() {
        assertEquals(1, spiderman.getIssue());
    }

    @Test
    void setIssue() {
        spiderman.setIssue(2);
        assertEquals(2, spiderman.getIssue());
    }

    @Test
    void getAuthor() {
        assertEquals("Stan Lee", spiderman.getAuthor());
    }

    @Test
    void setAuthor() {
        spiderman.setAuthor("Stanley");
        assertEquals("Stanley", spiderman.getAuthor());
    }

    @Test
    void getArtist() {
        assertEquals("Stan Less", spiderman.getArtist());
    }

    @Test
    void setArtist() {
        spiderman.setArtist("Stan Lee");
        assertEquals("Stan Lee", spiderman.getArtist());
    }

    @Test
    void getOriginalPrice() {
        assertEquals(0.35, spiderman.getOriginalPrice());
    }

    @Test
    void setOriginalPrice() {
        spiderman.setOriginalPrice(0.12);
        assertEquals(0.12, spiderman.getOriginalPrice());
    }

    @Test
    void getPublisher() {
        assertEquals("Marvel", spiderman.getPublisher());
    }

    @Test
    void setPublisher() {
        spiderman.setPublisher("Marvel Comics");
        assertEquals("Marvel Comics", spiderman.getPublisher());
    }

    @Test
    void getNumCopies() {
        assertEquals(1, spiderman.getNumCopies());
    }

    @Test
    void setNumCopies() {
        spiderman.setNumCopies(2);
        assertEquals(2, spiderman.getNumCopies());
    }
}