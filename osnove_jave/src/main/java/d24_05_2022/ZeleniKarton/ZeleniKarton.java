package d24_05_2022.ZeleniKarton;

public class ZeleniKarton {
    private String punoIme;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imeIprezimeProfesora;
    private int ocena;    //od 5 do 10

    public ZeleniKarton() {
    }

    public ZeleniKarton(String punoIme, String nazivPredmeta, int ocena) {
        this.punoIme = punoIme;
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeIprezimeProfesora() {
        return imeIprezimeProfesora;
    }

    public void setImeIprezimeProfesora(String imeIprezimeProfesora) {
        this.imeIprezimeProfesora = imeIprezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean polozen() {
        if (this.ocena > 5) {
            return true;
        } else {
            return false;
        }
    }

    public void stampaj() {
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student" + this.punoIme + this.brojIndeksa);
        System.out.println("Profesor: " + this.imeIprezimeProfesora);
    }
}
