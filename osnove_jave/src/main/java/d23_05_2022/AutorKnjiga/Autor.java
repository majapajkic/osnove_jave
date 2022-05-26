package d23_05_2022.AutorKnjiga;
/* Kreirati klasu Autor koja ima
-ime i prezime
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu:
(ime autora) (prezime autora) */

public class Autor {
    private String punoIme;

    public Autor() {
    }

    public Autor(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void print() {
        System.out.println("Ime i prezime autora je : " + this.punoIme);
    }
}

