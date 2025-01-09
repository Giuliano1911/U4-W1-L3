public class Chiamata {
    private final int numero;
    private final int durata;

    public Chiamata(int n, int d) {
        this.numero = n;
        this.durata = d;
    }

    public void getChiamata() {
        System.out.println(this.numero + " " + this.durata);
    }
}
