import java.util.LinkedList;
import java.util.List;

public class Wierzcholek {
    String nazwa;
    Wierzcholek(String nazwa) {
        this.nazwa = nazwa;
    }
    List<Krawedz> krawedzie = new LinkedList<>();

    @Override
    public String toString() {
        String wynik = nazwa + "-> | ";
        for(Krawedz k: krawedzie) wynik += k + " | ";
        return wynik;
    }
}
