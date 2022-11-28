import java.util.LinkedList;
import java.util.List;

public class Graf {
    String nazwa;
    Graf(String nazwa) {
        this.nazwa = nazwa;
    }
    Wierzcholek znajdz(Wierzcholek w){
        if(wierzcholki.contains(w)) return w;
        else return null;
    }
    void dodajKrawedz(String out, String in, int waga){
        if(!wierzcholki.contains(out)) {

        }
        if(!wierzcholki.contains(in)) {

        }

    }

    List<Wierzcholek> wierzcholki  = new LinkedList<>();

    @Override
    public String toString() {
        String wynik = nazwa + "\n";
        for(Wierzcholek w: wierzcholki) wynik += w + "\n";
        return wynik;
    }
}
