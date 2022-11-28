public class Krawedz {
    Wierzcholek skad, dokad;
    int waga;
    Krawedz(Wierzcholek v1, Wierzcholek v2, int waga) {
        this.skad = v1;
        this.dokad = v2;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return dokad.nazwa + "[" + waga + "]";
    }
}
