import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Kraftakt {
    private ArrayList<String> aktorer = new ArrayList<>();
    private ArrayList<Integer> postNr = new ArrayList<>();

    public ArrayList reader() {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Kraftleverandorer.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(br)

    }
}


