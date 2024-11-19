public class Brok {
    private int teller;
    private int nevner;
    private Brok sum;
    private Brok produkt;
    private Brok differanse;
    private Brok kvotient;

    public Brok(int t, int n){
        if (n == 0){
            throw new IllegalArgumentException("Å dele på null er bare tull!");
        }
        this.teller = t;
        this.nevner = n;
    }
    public Brok(int t){
        this.teller = t;
        this.nevner = 1;
    }
    public int getNevner(){
        return this.nevner;
    }
    public int getTeller(){
        return this.teller;
    }
    public String toString(Brok ledd){
        return (ledd.getTeller() + "/" + ledd.getNevner());
    }

    public Brok getSum(){
        return this.sum;
    }
    public Brok getDiff(){
        return this.differanse;
    }
    public Brok getProdukt(){
        return this.produkt;
    }
    public Brok getKvotient(){
        return this.kvotient;
    }

    public void addere(Brok ledd){
        if (this.nevner == ledd.getNevner()){
            this.sum = new Brok((this.teller + ledd.getTeller()),  this.nevner);
        }
        this.sum =new Brok((this.teller * ledd.getNevner() 
                        + this.nevner*ledd.getTeller()),  
                        this.nevner * ledd.getNevner());
        this.sum.shortenBrok();
    }
    public void subtrahere(Brok ledd){
        if (this.nevner == ledd.getNevner()){
            this.differanse = new Brok((this.teller - ledd.getTeller()), this.nevner);
        }
        else {
            this.differanse = new Brok((this.teller * ledd.getNevner() 
                            - this.nevner*ledd.getTeller()),  
                            this.nevner * ledd.getNevner());
        }
        this.differanse.shortenBrok();

    }
    public void multiplisere(Brok ledd){
        this.produkt = new Brok(this.teller * ledd.getTeller(), this.nevner * ledd.getNevner());
        this.produkt.shortenBrok();
    }
    public void dividere(Brok ledd){
        this.kvotient = new Brok(this.teller * ledd.getNevner(), this.nevner * ledd.getTeller());
        this.kvotient.shortenBrok();
    }
    public void  shortenBrok(){
        int gcd = findGCD(this.teller,  this.nevner);    
        this.teller /= gcd;
        this.nevner /= gcd;
    }
    private int findGCD(int a, int b){
        if (b==0) {
            return Math.abs(a);
        }
        return findGCD(b, a % b);
    }


    public static void main(String[] args) {
        Brok test1 = new Brok(-5,0);
        Brok test2 = new Brok(8);
        Brok test3 = new Brok(8, 4);
        Brok test4 = new Brok(9, 10);

        test1.addere(test4);
        System.out.println(test1.toString(test1.getSum()));

        test2.dividere(test3);
        System.out.println(test2.toString(test2.getKvotient()));

        test3.subtrahere(test1);
        System.out.println(test3.toString(test3.getDiff()));

        test4.multiplisere(test1);
        System.out.println(test4.toString(test4.getProdukt()));

        System.out.println(test1.getTeller());
        System.out.println(test2.getNevner());

        //System.out.println(test3.toString(test3.shortenBrok(test3.getDiff())));
    }

}