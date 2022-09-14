import java.io.*;
import java.util.Scanner;

public class Application {
    static String fileName;
    static Repository library = new Repository();
    static Scanner scanner = new Scanner(System.in);
    static boolean running = true;

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to your comic book collection!\n");
        while (running) {
            System.out.println("Enter 1 to load a collection.\nEnter 2 to list all comic books in the collection.\n" +
                    "Enter 3 to add a comic book to the collection\nEnter 0 to save and quit.");
            int response = Integer.parseInt(scanner.nextLine());
            switch (response) {
                case 0:
                    saveAndQuit();
                    break;

                case 1:
                    System.out.println("Enter the name of the collection you would like to load: ");
                    loadScript(scanner.nextLine());
                    break;

                case 2:
                    System.out.println(library.toString());
                    break;

                case 3:
                    addComic();
                    break;
            }
        }
        System.exit(0);
    }

    private static void addComic() {
        String title;
        int issue;
        String author;
        String artist;
        double originalPrice;
        String publisher;
        int numCopies;
        System.out.println("Enter the title of the comic book: ");
        title = scanner.nextLine();
        System.out.println("Enter the issue number: ");
        issue = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the author's name: ");
        author = scanner.nextLine();
        System.out.println("Enter the artist's name: ");
        artist = scanner.nextLine();
        System.out.println("Enter the original price of the comic book: $");
        originalPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the publisher's name: ");
        publisher = scanner.nextLine();
        System.out.println("Enter how many copies of this comic book you have: ");
        numCopies = Integer.parseInt(scanner.nextLine());

        ComicBook comicBook = new ComicBook(title, issue, author, artist, originalPrice, publisher, numCopies);
        library.addComicBook(comicBook);


    }

    private static void saveAndQuit() throws IOException {
        System.out.println("Enter file name: ");
        fileName = scanner.nextLine() + ".ser";
        running = false;

        FileOutputStream outputStream;
        ObjectOutputStream objectOutputStream;

        try {
            outputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(library);
            outputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("That file does not exist.");
        }

    }

    private static void loadScript(String name) throws FileNotFoundException {
        FileInputStream inputStream;
        ObjectInputStream objectInputStream;

        File file = new File(name + ".ser");
        if (file.exists()) {
            try {
                inputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(inputStream);
                library = (Repository) objectInputStream.readObject();
                inputStream.close();
                objectInputStream.close();

            } catch (IOException e) {
                throw new FileNotFoundException("That file does not exist.");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("That file does not exist.");
        }
    }
}
