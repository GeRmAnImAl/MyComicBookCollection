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
            System.out.println("Enter 1 to load a collection.\nEnter 2 to list all books in the collection.\n" +
                    "Enter 3 to add a book to the collection\nEnter 0 to save and quit.");
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

                    break;

                case 3:

                    break;
            }
        }
        System.exit(0);
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
        } catch(FileNotFoundException e){
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
