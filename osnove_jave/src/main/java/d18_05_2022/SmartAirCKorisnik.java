package d18_05_2022;

public class SmartAirCKorisnik {
    public static void main(String[] args) {
        SmartAirConditioning klima = new SmartAirConditioning();
        klima.marka = "Samsung";
        klima.temperatura = 17;
        klima.radi = true;
        klima.stampa();

        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Samsung";
        klima1.temperatura = 10;
        klima1.radi = true;
        klima1.stampa();
    }
}
