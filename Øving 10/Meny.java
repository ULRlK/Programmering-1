import java.util.ArrayList;

public class Meny {
  private String name;
  private ArrayList<Rett> retter = new ArrayList<>();

  public Meny(Rett rett, String name) {
    this.retter.add(rett);
    this.name = name;
  }
  public Meny(ArrayList<Rett> retter, String name) {
    this.retter = retter;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Rett> getRetter() {
    return this.retter;
  }

  /*
    * Legger til en rett i en meny
    * @param rett
   */
  public void addRett(Rett rett) {
    this.retter.add(rett);
  }

  /*
    * Finner retter av en hvis type i en meny
    * @param type
    * @return rettList
   */
  public ArrayList<Rett> getRettType(String type) {
    ArrayList<Rett> rettList = new ArrayList<>();
    for (Rett rett : this.retter) {
      if (rett.getType().equals(type)) {
        rettList.add(rett);
      }
    }
    return rettList;
  }

  /*
    * Sjekker om en rett er i menyen
    * @param name
    * @return boolean
   */
  public boolean checkRett(String name) {
    for (Rett rett: this.retter) {
      if (rett.getName().equals(name)) {
        return true;
      }
    }
    return false;
  }
  /*
    * Finner prisen på en meny
    * @return sum
   */
  public double getMenuPrice() {
    double sum = 0;
    for (Rett rett : this.retter) {
      sum += rett.getPrice();
    }
    return sum;
  }
}
