public class Eiendom {
  private final int kommuneNr; // Mellom 101 og 5054
  private String kommuneNavn;
  private final int gnr; // positivt heltall
  private final int bnr; // positivt heltall
  private final String bruksnavn;
  private final double areal; // positivt heltall
  private final String eier;

  public Eiendom(int kommuneNr, String kommuneNavn, int gnr, int bnr, String bruksnavn, double areal, String eier) {
    this.kommuneNr = kommuneNr;
    this.kommuneNavn = kommuneNavn;
    this.gnr = gnr;
    this.bnr = bnr;
    this.bruksnavn = bruksnavn;
    this.areal = areal;
    this.eier = eier;
  }

  public int getKommuneNr() {
    return kommuneNr;
  }

  public String getKommuneNavn() {
    return kommuneNavn;
  }

  public int getGnr() {
    return gnr;
  }

  public int getBnr() {
    return bnr;
  }

  public String getBruksnavn() {
    return bruksnavn;
  }

  public double getAreal() {
    return areal;
  }

  public String getEier() {
    return eier;
  }



  public String toString() {
    return "Kommunenavn: " + kommuneNavn + ", Bruksnavn: " + bruksnavn + ", Areal: " + areal +
        ", Eier: " + eier + ", KommuneNr - Gnr - Bnr: " + kommuneNr + "-" + gnr + "/" + bnr;
  }

}
