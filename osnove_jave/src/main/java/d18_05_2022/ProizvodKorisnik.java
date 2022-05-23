package d18_05_2022;

public class ProizvodKorisnik {
    public static void main(String[] args) {
        Proizvod voce = new Proizvod();
        voce.naziv = "jagode";
        voce.cena = 350.00;
        voce.tezina = 3.00;
        voce.stampaPodataka();

        Proizvod povrce = new Proizvod();
        povrce.naziv = "paradajiz";
        povrce.cena = 250.00;
        povrce.tezina = 1.50;
        povrce.stampaPodataka();
    }
}

