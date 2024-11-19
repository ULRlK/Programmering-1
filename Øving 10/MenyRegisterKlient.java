public class MenyRegisterKlient {
  public static void main(String[] args) {
    Rett rett1 = new Rett("Rett1", "Oppskrift1", "Type1", 100);
    Rett rett2 = new Rett("Rett2", "Oppskrift2", "Type2", 200);
    Rett rett3 = new Rett("Rett3", "Oppskrift3", "Type3", 300);

    Meny menu1 = new Meny(rett1, "Menu1");
    Meny menu2 = new Meny(rett2, "Menu2");
    menu1.addRett(rett2);
    menu2.addRett(rett3);

    MenyRegister menyRegister = new MenyRegister(menu1);
    menyRegister.addMeny(menu2);
    menyRegister.addRettToMeny("Menu1", rett3);
    System.out.println("Finne rett:");
    System.out.println(menyRegister.findRett("Rett1"));
    System.out.println(menyRegister.findRett("Rett2"));
    System.out.println("----------");
    System.out.println("Finne pris:");
    System.out.println(menyRegister.findMenuPrice(600));
    System.out.println(menyRegister.findMenuPrice(599));
    System.out.println("----------");
    System.out.println("Finne type:");
    System.out.println(menyRegister.findRettType("Type1"));
    System.out.println(menyRegister.findRettType("Type2"));
    System.out.println("----------");
    System.out.println("Meny navn:");
    Meny meny3 = new Meny(rett3, "Menu3");
    menyRegister.addMeny(meny3);
    System.out.println(menyRegister.getMenyNavn());
    System.out.println("----------");
    System.out.println("finne rett oppskrift:");
    System.out.println(menyRegister.findRettRecipe("Rett1"));






  }

}
