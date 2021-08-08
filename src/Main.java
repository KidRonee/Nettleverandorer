import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Hei, velkommen til nettleielokatoren til Mathias!");
        while(exit == false) {
            new Program();
            System.out.println("trykk enter for nytt postnummer.");
            System.out.println("skriv exit hvis du ønsker å avslutte.");
            if (sc.nextLine().equals("exit"))
                exit = true;
        }
        System.out.println("hadebra!");
    }
}
