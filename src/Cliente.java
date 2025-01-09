import java.util.Date;

public class Cliente {
    private final int id;
    private String nome;
    private String email;
    private final Date data;

    public Cliente(int id, String n, String e, Date d) {
        this.id = id;
        this.nome = n;
        this.email = e;
        this.data = d;
    }
}
