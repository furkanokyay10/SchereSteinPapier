import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();


        String[] objekteListe = {"Schere", "Stein", "Papier"};

        int spielerPunkte = 0;
        int pcPunkte = 0;

        //Schleife
        while(true) {

            System.out.println("Wähle entweder Schere, Stein oder Papier (oder 'exit' zum Beenden): ");
            String spielerwahl = s.nextLine().toLowerCase();

            //das Spiel zu beenden
            if (spielerwahl.equals("exit")) {
                System.out.println("Spiel beendet.");
                break;
            }

            // ZufälligeAuswahl
            int pcwahlIndex = random.nextInt(3);  // Zufallszahl zwischen 0 und 2
            String pcwahl = objekteListe[pcwahlIndex];

            System.out.println("Der PC hat " + pcwahl + " gewählt.");

            // Logik für Entscheidungen
            if (spielerwahl.equals("schere")) {
                if (pcwahl.equals("Schere")) {
                    System.out.println("Unentschieden!");
                } else if (pcwahl.equals("Stein")) {
                    pcPunkte++;
                    System.out.println("Der PC hat gewonnen!");
                } else {
                    spielerPunkte++;
                    System.out.println("Sie haben gewonnen!");
                }
            } else if (spielerwahl.equals("stein")) {
                if (pcwahl.equals("Stein")) {
                    System.out.println("Unentschieden!");
                } else if (pcwahl.equals("Papier")) {
                    pcPunkte++;
                    System.out.println("Der PC hat gewonnen!");
                } else {
                    spielerPunkte++;
                    System.out.println("Sie haben gewonnen!");
                }
            } else if (spielerwahl.equals("papier")) {
                if (pcwahl.equals("Papier")) {
                    System.out.println("Unentschieden!");
                } else if (pcwahl.equals("Schere")) {
                    pcPunkte++;
                    System.out.println("Der PC hat gewonnen!");
                } else {
                    spielerPunkte++;
                    System.out.println("Sie haben gewonnen!");
                }
            } else {
                System.out.println("Ungültige Eingabe, bitte wählen Sie Schere, Stein oder Papier.");
            }

            // Punktestand
            System.out.println("Spieler: " + spielerPunkte + " | PC: " + pcPunkte);
        }

        s.close();
    }
}
