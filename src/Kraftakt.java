
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kraftakt {
    public  ArrayList<String> aktorer = new ArrayList<>();
    private  ArrayList<Integer> postNr = new ArrayList<>();

    public Kraftakt() {
        reader();
    }

    public ArrayList<String> reader() {
        try (Scanner sc = new Scanner(new File("src\\Kraftleverandorer.txt"))) {
            while (sc.hasNextLine()) {
                aktorer.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("error");
        }
        return aktorer;
    }
}


