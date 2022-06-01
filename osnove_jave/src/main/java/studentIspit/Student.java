package studentIspit;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student() {
    }

    public Student(int brojIndeksa, String punoIme, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }

    public double prosekNaStudijama() {
        double prosecnaOcenaPolozenih = 0;
        int brojPolozenihIspita = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (this.ispiti.get(i).getOcena() > 5) {
                brojPolozenihIspita += 1;
                prosecnaOcenaPolozenih = prosecnaOcenaPolozenih +
                        this.ispiti.get(i).getOcena();
            }
        }
        return prosecnaOcenaPolozenih / brojPolozenihIspita;
    }

    public void stampaj() {
        System.out.println(this.brojIndeksa + " - " + this.punoIme + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getNazivPredmeta() +
                    " - " + this.ispiti.get(i).getImeProfesora() +
                    " - " + this.ispiti.get(i).getOcena());
        }
        System.out.println("Prosecna ocena polozenih ispita je: " + this.prosekNaStudijama());
    }
}


