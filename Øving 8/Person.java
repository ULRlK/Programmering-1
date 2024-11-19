public class Person {
    String fornavn;
    String etternavn;
    int fodselaar;

    public Person(String fornavn, String etternavn, int fodselaar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselaar = fodselaar;
    }

    public String getFornavn() {
        return fornavn;
    }  

    public String getEtternavn() {
        return etternavn;
    }

    public int getFodselaar() {
        return fodselaar;
    }
    
}
