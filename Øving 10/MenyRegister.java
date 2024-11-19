import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/**
 * MenyRegister
 * Register for menyer
 * Denne klassen kan:
 * - Legge til en meny
 * - Legge til en rett til en meny
 * - Finne hvilke menyer som har en rett
 * - Finne hvilke menyer som har en pris under et gitt beløp
 * - Å finne alle menyer av en gitt type
 */

public class MenyRegister {

  private ArrayList<Meny> menyer = new ArrayList<>();



  public MenyRegister(Meny meny) {
    this.menyer.add(meny);
  }


  /*
  * Legger til en meny
  * @param meny
   */
  public void addMeny(Meny meny) {
    this.menyer.add(meny);
  }

  /*
  * Legger til en rett til en meny
  * @param menyName
  * @param rett
   */
  public void addRettToMeny(String menyName, Rett rett) {
    for (Meny meny : this.menyer) {
      if (meny.getName().equals(menyName)) {
        meny.addRett(rett);
      }
    }
  }

  /*
  * Finner hvilke menyer som har en rett
  * @param name
  * @return menyList
   */
  public ArrayList<String> findRett(String name) {
    ArrayList<String> menyList = new ArrayList<>();
    for (Meny menu : this.menyer) {
      if (menu.checkRett(name)) {
        menyList.add(menu.getName());
      }
    }
    return menyList;
  }

  /*
  * Finner hvilke menyer som har en pris under et gitt beløp
  * @param price
  * @return menyList
   */
  public ArrayList<String> findMenuPrice(double price) {
    ArrayList<String> menyList = new ArrayList<>();
    for (Meny menu : this.menyer) {
      if (menu.getMenuPrice() <= price) {
        menyList.add(menu.getName());
      }
    }
    return menyList;
  }
  /*
  * Finner alle retter av en gitt type i alle menyer
  * @param type
  * @return rettList
   */
  public Set<String> findRettType(String type) {
    Set<String> rettList = new HashSet<>();
    for(Meny menu : this.menyer) {
      for (Rett rett : menu.getRettType(type)) {
        rettList.add(rett.getName());
      }
    }
    return rettList;
  }

  /*
  * Returnerer en liste over alle menyer
  * @return menyList
   */
  public ArrayList<String> getMenyNavn() {
    ArrayList<String> menyList = new ArrayList<>();
    for (Meny menu : this.menyer) {
      menyList.add(menu.getName());
    }
    return menyList;
  }

  public String findRettRecipe(String name) {
    for (Meny menu : this.menyer) {
      for (Rett rett : menu.getRetter()) {
        if (rett.getName().equals(name)) {
          return rett.getRecipe();
        }
      }
    }
    return "Fant ikke retten";
  }







}
