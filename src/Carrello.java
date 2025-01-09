public class Carrello {
    private final Cliente cliente;
    private Articolo[] carrello;
    private double tot;
    private int nArticoli;

    public Carrello(Cliente c) {
        this.cliente = c;
        this.carrello = new Articolo[1];
        this.tot = 0;
        this.nArticoli = 0;
    }
}
