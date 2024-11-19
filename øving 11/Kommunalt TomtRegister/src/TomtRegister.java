import java.util.ArrayList;

public class TomtRegister {
  ArrayList<Eiendom> eiendommer = new ArrayList<Eiendom>();

  public TomtRegister() {
  }

  public TomtRegister (ArrayList<Eiendom> eiendommer) {
    this.eiendommer = eiendommer;
  }

  public void addEiendom(Eiendom eiendom) {
    eiendommer.add(eiendom);
  }

  public ArrayList<Eiendom> getEiendommer() {
    return eiendommer;
  }

  public Eiendom FindEiendom(int kommuneNr, int gnr, int bnr) {
    for (Eiendom eiendom : eiendommer) {
      if (eiendom.getKommuneNr() == kommuneNr && eiendom.getGnr() == gnr && eiendom.getBnr() == bnr) {
        return eiendom;
      }
    }
    return null;
  }
  public double avgAreal() {
    double sum = 0;
    for (Eiendom eiendom : eiendommer) {
      sum += eiendom.getAreal();
    }
    return sum / eiendommer.size();
  }


}
