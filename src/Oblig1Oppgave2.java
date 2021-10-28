import javax.naming.InvalidNameException;
import javax.swing.*;

public class Oblig1Oppgave2 {

    public static void main(String[] args) {
        String navn1 = JOptionPane.showInputDialog("Navn for vare 1");
        String antall1 = JOptionPane.showInputDialog("Antall for vare 1");
        String pris1 = JOptionPane.showInputDialog("Pris for vare 1");

        String navn2 = JOptionPane.showInputDialog("Navn for vare 2");
        String antall2 = JOptionPane.showInputDialog("Antall for vare 2");
        String pris2 = JOptionPane.showInputDialog("Pris for vare 2");

        try{
            int convertedAntall1 = Integer.parseInt(antall1);
            int convertedAntall2 = Integer.parseInt(antall2);
            double convertedPris1 = Double.parseDouble(pris1);
            double convertedPris2 = Double.parseDouble(pris2);

            Vare vare1 = new Vare(navn1, convertedAntall1, convertedPris1);
            Vare vare2 = new Vare(navn2, convertedAntall2, convertedPris2);

            vare1.setNavn("dkskl");

            double totalPris = vare1.totalPris() + vare2.totalPris();
            System.out.println("Totalprisen ble : " +totalPris + "kr");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Skriv inn det du får beskjed om ;)");
        }


    }
}
