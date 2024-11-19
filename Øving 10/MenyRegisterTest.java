import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.Test;

public class MenyRegisterTest {


  @org.junit.jupiter.api.Test
  void testAddMenny() {
    Rett rett1 = new Rett("Rett1", "Oppskrift1", "Type1", 100);
    Rett rett2 = new Rett("Rett2", "Oppskrift2", "Type2", 200);
    Rett rett3 = new Rett("Rett3", "Oppskrift3", "Type3", 300);

    Meny menu1 = new Meny(rett1, "Menu1");
    Meny menu2 = new Meny(rett2, "Menu22");
    menu1.addRett(rett2);
    menu1.addRett(rett3);
    menu2.addRett(rett3);




  }

  @org.junit.jupiter.api.Test
  void addMeny() {
  }

  @org.junit.jupiter.api.Test
  void addRettToMeny() {
  }

  @org.junit.jupiter.api.Test
  void findRett() {
  }

  @org.junit.jupiter.api.Test
  void findMenuPrice() {
  }

  @org.junit.jupiter.api.Test
  void findRettType() {
  }

  @org.junit.jupiter.api.Test
  void getMenyNavn() {
  }
}