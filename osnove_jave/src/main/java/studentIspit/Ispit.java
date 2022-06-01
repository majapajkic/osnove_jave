package studentIspit;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String imeProfesora;

    public Ispit() {
    }

    public Ispit(String nazivPredmeta, int ocena, String imeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imeProfesora = imeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public boolean daLiJePolozen() {
        if (this.ocena > 5) {
            return true;
        } else {
            return false;
        }
    }

    public void stampaj() {
        System.out.println(this.nazivPredmeta + " - " + this.imeProfesora +
                " - " + this.ocena);
    }
}
