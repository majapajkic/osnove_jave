package osobaIgracTrener;

public class Osoba {
    protected String imeIprezime;
    protected String jmbg;
    protected int godRodjenja;

    public Osoba() {
    }

    public Osoba(String imeIprezime, String jmbg, int godRodjenja) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void stampaj() {
        System.out.println(this.imeIprezime + ", jmbg:" + this.jmbg + ", godiste:" + this.godRodjenja);
    }
}
