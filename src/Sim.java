import java.util.Arrays;

public class Sim {
    private final int numero;
    private int credito;
    private Chiamata[] lista;

    public Sim(int n) {
        this.numero = n;
        this.credito = 0;
        lista = new Chiamata[5];
    }

    public void getSim() {
        System.out.println(this.numero + " " + this.credito);
        if (this.lista[0] != null) {
            for (Chiamata chiamata : this.lista) {
                chiamata.getChiamata();
            }
        }
    }

    public void addCredito(int credito) {
        if (credito > 0) {
            this.credito += credito;
        } else {
            System.out.println("solo positivi");
        }
    }

    public void addChiamate(int n1, int d1, int n2, int d2, int n3, int d3, int n4, int d4, int n5, int d5) {
        this.lista[0] = new Chiamata(n1, d1);
        this.lista[1] = new Chiamata(n2, d2);
        this.lista[2] = new Chiamata(n3, d3);
        this.lista[3] = new Chiamata(n4, d4);
        this.lista[4] = new Chiamata(n5, d5);
    }
}
