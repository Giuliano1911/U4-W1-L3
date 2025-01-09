import org.jetbrains.annotations.NotNull;

public class Rettangolo {
    private final int base;
    private final int altezza;

    public Rettangolo(int b, int h) {
        this.base = b;
        this.altezza = h;
    }

    public int perimetro(int b, int h) {
        return (h * 2) + (b * 2);
    }

    public int area(int b, int h) {
        return h * b;
    }

    public void getRettangolo() {
        System.out.println("Perimetro: " + perimetro(this.base, this.altezza) + " , Area: " + area(this.base, this.altezza));
    }

    public void dueRettangoli(@NotNull Rettangolo b) {
        int p1 = perimetro(this.base, this.altezza);
        int a1 = area(this.base, this.altezza);

        int p2 = perimetro(b.base, b.altezza);
        int a2 = area(b.base, b.altezza);

        this.getRettangolo();
        b.getRettangolo();

        System.out.println("Somma perimetri: " + (p1 + p2) + " , Somma aree: " + (a1 + a2));
    }
}
