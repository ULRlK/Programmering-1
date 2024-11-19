public class Øving4Oppgave2 {
    public static void main(String[] args) {
        Spiller ulrik1 = new Spiller("Ulrik1");
        Spiller aminda = new Spiller("Aminda");
    
        do {
            ulrik1.kastTerningen();
            aminda.kastTerningen();
            System.out.println("Ulrik 1 sin poengsum er " + ulrik1.getSumPoeng());
            System.out.println("Ulrik 2 sin poengsum er " + aminda.getSumPoeng());





            if (ulrik1.erFerdig() == true & aminda.erFerdig() == true & ulrik1.getSumPoeng()==aminda.getSumPoeng()){
                ulrik1.sumPoeng = 0;
                aminda.sumPoeng = 0;
            }
        } while(ulrik1.erFerdig() == false & aminda.erFerdig() == false);
        if (ulrik1.erFerdig() == true) {
            System.out.println("Etter " + ulrik1.antallKast + " kast, vant " + ulrik1.getNavn());
        }
        else{
            System.out.println("Etter " + aminda.antallKast + " kast, vant " + aminda.getNavn());
        }

}   
}
