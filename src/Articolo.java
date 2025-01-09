public class Articolo {
    private final int id;
    private String descrizione;
    private double prezzo;
    private int n;

    public Articolo(int id, String d, double p, int n) {
        this.id = id;
        this.descrizione = d;
        this.prezzo = p;
        this.n = n;
    }
}
