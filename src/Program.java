import java.io.IOException;
import java.util.Scanner;

public class Program {
    public Program() throws IOException {
        Scanner sc = new Scanner(System.in);
        Kraftakt ka = new Kraftakt();
        menu();
        ka.findProvider(String.valueOf(sc.nextLine()));
    }

    public void menu() {
        System.out.print("Fyll inn postnummer: \n> ");
    }
}
