package osobaIgracTrener;

public class Igrac extends Osoba {
    private int brojNaLedjima;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {
    }

    public Igrac(String imeIprezime, String jmbg, int godRodjenja, int brojNaLedjima, String pozicija, boolean kapiten) {
        super(imeIprezime, jmbg, godRodjenja);
        this.brojNaLedjima = brojNaLedjima;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBrojNaLedjima() {
        return brojNaLedjima;
    }

    public void setBrojNaLedjima(int brojNaLedjima) {
        this.brojNaLedjima = brojNaLedjima;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj na ledjima: " + this.brojNaLedjima + ", " + this.pozicija + ", da li je kapiten:" + this.kapiten);
    }
}

