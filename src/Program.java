import java.io.IOException;
import java.util.stream.Collectors;

public class Program {
    public Program() throws IOException {
        menu();
    }

    public void menu() {
        System.out.println("Hei, velkommen til nettleielokatoren til Mathias!");
        System.out.println("Tast 1 for å komme i gang (:");
    }

    public void lokaliser(int postNummer) throws IOException {
        Kraftakt ka = new Kraftakt();
        if (postNummer > 1449 && postNummer < 1461) {
            System.out.println(ka.aktorer.stream().filter(it -> it.contains("Norgesnett")).collect(Collectors.toList()));
            return;
        }
        if (postNummer > 1679 && postNummer < 1693) {
            System.out.println(ka.aktorer.stream().filter(it -> it.contains("Norgesnett")).collect(Collectors.toList()));
            System.out.println("Hvaler");
            return;
        }
        if (postNummer > 1880 && postNummer < 1900) {
            System.out.println(ka.aktorer.stream().filter(it -> it.contains("Rakkestad")).collect(Collectors.toList()));
            System.out.println("Rakkestad");
            return;
        }
        if (postNummer > 1900 && postNummer < 1920) {
            System.out.println(ka.aktorer.stream().filter(it -> it.contains("Norgesnett")).collect(Collectors.toList()));
            System.out.println("Rakkestad");
            return;
        }
        if(postNummer <= 2477) {
            System.out.println(ka.aktorer.stream().filter(it -> it.contains("Elvia")).collect(Collectors.toList()));
            return;
        }

        else {
            System.out.println("error, not found!");
        }
    }
}
