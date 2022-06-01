package osobaIgracTrener;

public class Trener extends Osoba {
    private int godIskustva;
    private String tip;

    public Trener() {
    }

    public Trener(String imeIprezime, String jmbg, int godRodjenja, int godIskustva, String tip) {
        super(imeIprezime, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tip = tip;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println(this.godIskustva + " godina iskustva, " + this.tip + " trener");
    }
}
