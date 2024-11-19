//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/

import java.util.Scanner;

/**
 * Hell coPilot, i am making a text based menu, help me please senpai, it is within the while loop :)
 */

public class Main {

  public static void main(String[] args) {
    int a = 1;
    TomtRegister tomtRegister = new TomtRegister();
    tomtRegister.addEiendom(new Eiendom(1445, "Gluppen", 77, 631, "", 1017.6, "Jens Olsen"));
    tomtRegister.addEiendom(new Eiendom(1445, "Gluppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
    tomtRegister.addEiendom(new Eiendom(1445, "Gluppen", 75,  19, "Fugletun", 650.6, "Evilyn Jensen"));
    tomtRegister.addEiendom(new Eiendom(1445, "Gluppen", 74,  188, "", 1457.2, "Karl Ove Bråten"));
    tomtRegister.addEiendom(new Eiendom(1445, "Gluppen", 74,  47, "Høiberg", 1339.4, "Elsa Indregård"));
    Scanner scanner = new Scanner(System.in);

    while (a != 0) {
      System.out.println("1. Legg til eiendom");
      System.out.println("2. Finn eiendom");
      System.out.println("3. Gjennomsnittlig areal");
      System.out.println("4. Skriv ut alle eiendommer");
      System.out.println("0. Avslutt");

      a = scanner.nextInt();

      switch (a) {
        case 1:
          System.out.println("Legg til eiendom:");
          System.out.print("KommuneNr: ");
          int kommuneNr = scanner.nextInt();
          scanner.nextLine(); // Consume newline
          System.out.print("KommuneNavn: ");
          String kommuneNavn = scanner.nextLine();
          System.out.print("Gnr: ");
          int gnr = scanner.nextInt();
          System.out.print("Bnr: ");
          int bnr = scanner.nextInt();
          scanner.nextLine(); // Consume newline
          System.out.print("Bruksnavn: ");
          String bruksnavn = scanner.nextLine();
          System.out.print("Areal: ");
          double areal = scanner.nextDouble();
          scanner.nextLine(); // Consume newline
          System.out.print("Eier: ");
          String eier = scanner.nextLine();
          Eiendom eiendom = new Eiendom(kommuneNr, kommuneNavn, gnr, bnr, bruksnavn, areal, eier);
          tomtRegister.addEiendom(eiendom);
          break;
        case 2:
          System.out.println("Finn eiendom:");
          System.out.print("KommuneNr: ");
          kommuneNr = scanner.nextInt();
          System.out.print("Gnr: ");
          gnr = scanner.nextInt();
          System.out.print("Bnr: ");
          bnr = scanner.nextInt();
          Eiendom foundEiendom = tomtRegister.FindEiendom(kommuneNr, gnr, bnr);
          if (foundEiendom != null) {
            System.out.println("Eiendom funnet: " + foundEiendom);
          } else {
            System.out.println("Eiendom ikke funnet.");
          }
          break;
        case 3:
          System.out.println("Gjennomsnittlig areal: " + tomtRegister.avgAreal());
          break;
        case 4:
          System.out.println("Alle eiendommer:");
          for (Eiendom e : tomtRegister.getEiendommer()) {
            System.out.println(e.toString());
          }
          break;
        case 0:
          System.out.println("Avslutter...");
          break;
        default:
          System.out.println("Ugyldig valg, prøv igjen.");
          break;
      }
    }
    scanner.close();

    }
  }
