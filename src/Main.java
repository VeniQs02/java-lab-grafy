public class Main {
    public static void main(String[] args) {
        Graf g = new Graf("Mapa Polski");
        Wierzcholek v1 = new Wierzcholek("Bydgoszcz");
        Wierzcholek v2 = new Wierzcholek("Sosnowiec");
        Wierzcholek v3 = new Wierzcholek("Hajnówka");

        g.wierzcholki.add(v1);
        g.wierzcholki.add(v2);
        g.wierzcholki.add(v3);

        Krawedz k1 = new Krawedz(v1, v2, 20);
        Krawedz k2 = new Krawedz(v1, v3, 10);
        Krawedz k3 = new Krawedz(v3, v2, 25);
        Krawedz k4 = new Krawedz(v3, v1, 10);

        g.dodajKrawedz("Białystok", "Warszawa", 50);


        System.out.println(g);
    }
}