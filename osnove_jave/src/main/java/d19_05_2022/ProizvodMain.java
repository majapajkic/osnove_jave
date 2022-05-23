package d19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod p = new Proizvod();
        p.naziv = "jagode";
        p.cena = 250.00;
        p.tezina = 500;
        p.stampaj();
        double jagodeSkuplje = p.povecajCenu(50.00);
        System.out.println("Jagode prva klasa su: " + jagodeSkuplje);
        double jagodaPopust = p.vratiCenuSaPopustom(50);
        System.out.println("Jagode druga klasa su: " + jagodaPopust);
        p.racunajPostarinu();
        System.out.println();

        Proizvod s = new Proizvod();
        s.naziv = "dokument";
        s.cena = 70.00;
        s.tezina = 20;
        s.stampaj();
        double dokumentPoskupeo = s.povecajCenu(5.00);
        System.out.println("Dokument sa poskupljenjem je : " + dokumentPoskupeo);
        double dokumentSaPopustom = s.vratiCenuSaPopustom(10);
        System.out.println("Dokument sa popustom je : " + dokumentSaPopustom);
        s.racunajPostarinu();

    }

}
