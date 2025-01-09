public class Main {
    public static void main(String[] args) {

        Rettangolo r1 = new Rettangolo(10, 5);
        Rettangolo r2 = new Rettangolo(2, 4);
        r1.dueRettangoli(r2);

        Sim s1 = new Sim(234258);
        s1.addCredito(50);
        s1.addChiamate(123, 3, 234, 4, 345, 5, 456, 6, 567, 7);
        s1.getSim();


    }
}