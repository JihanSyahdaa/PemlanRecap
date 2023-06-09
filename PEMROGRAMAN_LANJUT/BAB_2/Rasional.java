package PRAKTIKUM;

public class Rasional {
    private int pembilang, penyebut, m, n;
    public Rasional(){
        pembilang=0;
        penyebut=0;
        m = pembilang;
        n = penyebut;
    }

    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
        m = pembilang;
        n = penyebut;
    }

    public boolean isRasional(){
        return (penyebut!= 0);
    }

    public void Sederhana(){
        int temp, A, B;
        if (penyebut ==0){
            return;
        }

        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;

        for (; B != 0; temp = A % B, A = B, B = temp) {
        }

        pembilang /=A;
        penyebut /=A;
    }

    public double Cast(){
        return penyebut==0 ? Double.NaN : (double)pembilang / (double)penyebut;
    }

    public boolean moreThan (Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    
    public boolean lessThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    
    public boolean moreThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    
    public void negasi() {
        pembilang = -pembilang;
    }

    public void unaryPlus(Rasional A) {
        pembilang=m;
        penyebut=n;
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void kurang(Rasional A) {
        pembilang=m;
        penyebut=n;
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void kali(Rasional A) {
        pembilang=m;
        penyebut=n;
        pembilang *= A.pembilang;
        penyebut *= A.penyebut;
    }

    public void bagi(Rasional A) {
        pembilang=m;
        penyebut=n;
        pembilang *= A.penyebut;
        penyebut *= A.pembilang;
    }
    
    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
