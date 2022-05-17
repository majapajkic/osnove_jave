package d16_05_2022;
/* Napisati metodu koja stampa podatke o korisniku u formatu:
JMBG: [jmbg]     Ime: [ime]         Prezime: [prezime]
God. rodjenja: [god]           Aktivan: [true/false]
Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.   */

public class DomaciZ3 {
    public static void main(String[] args) {
       printPerson(1010999715888L,"Anita", "Lukic", 1999, true);
    }
    static void printPerson (long jmbg, String ime, String prezime, int godRodjenja, boolean aktivan){
        System.out.println("JMBG: " + jmbg +"\nIme: " + ime + "\nPrezime: " + prezime +
                "\nGod. rodjenja: " + godRodjenja + "\nAktivan: " + aktivan);
    }
}
