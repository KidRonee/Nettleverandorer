<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
=======
import java.io.*;
>>>>>>> 85e5a0f67367234e565a6a5de0909f96e4ff7431
import java.util.ArrayList;
import java.util.Scanner;

public class Kraftakt {
    private ArrayList<String> aktorer = new ArrayList<>();
    private ArrayList<Integer> postNr = new ArrayList<>();

    public Kraftakt() {
<<<<<<< HEAD
        readFromFile();
    }

    public void readFromFile() {
        File myFile = new File("C:\\Users\\Mathi\\IdeaProjects\\Nettleverandorer\\src\\Kraftleverandorer.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()) {
=======
        reader();
    }

    public void reader() {
        try (Scanner sc = new Scanner(new File("C:\\Users\\TM61\\git\\src\\Kraftleverandorer.txt"))) {
            while (sc.hasNextLine()) {
>>>>>>> 85e5a0f67367234e565a6a5de0909f96e4ff7431
                aktorer.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
<<<<<<< HEAD
            System.out.println("error");
=======
>>>>>>> 85e5a0f67367234e565a6a5de0909f96e4ff7431
        }
        System.out.println(aktorer);
    }
}


