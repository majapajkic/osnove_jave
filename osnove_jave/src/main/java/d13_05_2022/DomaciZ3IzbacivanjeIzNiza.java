package d13_05_2022;
/* Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti (ne u nosi ih korisnik)
a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza.
Pre i nakon izbacivanja ispisati niz na ekranu. Ukoliko korisnik unese poziciju
van opsega niza,
ispisati poruku o gresci.
Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
Primer izvrsenja 1:
Niz je: 1,3,5,6,7,1,3,4,2,9
Unesite poziciju za izbacivanje: 5  ............  */
import java.util.Scanner;
import java.util.ArrayList;
public class DomaciZ3IzbacivanjeIzNiza {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();
        niz.add(1);niz.add(2);niz.add(3);niz.add(4);niz.add(5);niz.add(6);niz.add(7);niz.add(8);niz.add(9);niz.add(10);
        for (Integer integer : niz) {
            System.out.print(" " + integer + " ");
        }
            Scanner s = new Scanner(System.in);
            System.out.println("Unesite poziciju elementa koji zelite da izbacite");
            int pozicija = s.nextInt();
            niz.remove(pozicija);
        System.out.println(niz);
            }

        }


