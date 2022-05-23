package d18_05_2022;
/* Kreirati klasu SmartAirConditioning koja ima:
atribut za marku klime (npr: Samsung, Galanz, Gree, …)
atribut za izabranu temperaturu (minimum je 16, maksimum 35)
atribut za mod (hladi/greje)
metodu za stampu - stampa u formatu: Proizvoljno :)
U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih
pozvati metodu za stampu         */

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public boolean radi;         //ili String

    public void stampa() {
        if (temperatura > 16 && temperatura < 35) {
            System.out.println("Klima marke: " + this.marka + ", rasladjuje na temperaturu: "
                    + this.temperatura + " , na modu: " + this.radi);
        } else
            System.out.println("Unesite temperaturu u opsegu od 16 do 35C");
    }
}
