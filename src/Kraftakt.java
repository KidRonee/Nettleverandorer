import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Kraftakt {
    private ArrayList<String> aktorer = new ArrayList<>();
    private ArrayList<Integer> postNr = new ArrayList<>();

    public Kraftakt() {
        reader();
    }

    public void reader() {
        try (Scanner sc = new Scanner(new File("C:\\Users\\TM61\\git\\src\\Kraftleverandorer.txt"))) {
            while (sc.hasNextLine()) {
                aktorer.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(aktorer);
    }
}


