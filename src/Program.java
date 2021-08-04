import java.util.stream.Collectors;

public class Program {
    public Program() {
        menu();
        lokaliser(0256);
    }

    public void menu() {
        System.out.println("Hei, velkommen til nettleielokatoren til Mathias!");
        System.out.println("Tast 1 for å komme i gang (:");
    }

    public void lokaliser(int postNummer) {
        Kraftakt ka = new Kraftakt();
        if(postNummer <= 1295) {
            System.out.println(ka.aktorer.stream().filter(it -> it.contains("Elvia")).collect(Collectors.toList()));
        } else {
            System.out.println("not found...");
        }
    }
}
