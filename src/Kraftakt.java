import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kraftakt {
    private ArrayList<String> aktorer = new ArrayList<>();
    private ArrayList<Integer> postNr = new ArrayList<>();

    public Kraftakt() {
        readFromFile();
    }

    public void readFromFile() {
        File myFile = new File("C:\\Users\\Mathi\\IdeaProjects\\Nettleverandorer\\src\\Kraftleverandorer.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()) {
                aktorer.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("error");
        }
        System.out.println(aktorer);
    }
}
