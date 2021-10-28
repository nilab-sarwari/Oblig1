
public class Oblig1Oppgave1 {
    public static void main(String[] args) {
        Sirkel sirkel = new Sirkel();
        double r = 23.5;

        System.out.println(String.format("%.2f", sirkel.getAreal(r)));
        System.out.println(String.format("%.2f", sirkel.getOmkrets(r)));
        System.out.println(String.format("%.2f", sirkel.getDiameter(r)));
    }
}
