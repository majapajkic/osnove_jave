package d13_05_2022;
/* Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju
za koju se racuna suma.
Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti
elemenata iznad, ispod, sleve i sdesne strane tog elementa
(Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
Za racunanje sume, nije potrebna petlja! \     */

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZ1NizOd25 {
    public static void main(String[] args) {
        int suma=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite poziciju: ");
        int pozicija=s.nextInt();

        ArrayList <Integer> niz = new ArrayList<>();
        niz.add(1);niz.add(2);niz.add(3);niz.add(4);niz.add(5);
        niz.add(6);niz.add(7);niz.add(8);niz.add(9);niz.add(10);
        niz.add(11);niz.add(12);niz.add(13);niz.add(14);niz.add(15);
        niz.add(16);niz.add(17);niz.add(18);niz.add(19);niz.add(20);
        niz.add(21);niz.add(22);niz.add(23);niz.add(24);niz.add(25);
            //System.out.println();
        for (int i = 0; i < 25; i++) {
            System.out.print(" " + niz.get(i)+ " ");
                if (i % 5 == 4){
                    System.out.println();
                }
        }
            suma=suma+niz.get(pozicija)+ niz.get(pozicija+1)+niz.get(pozicija-1)+
                    niz.get(pozicija+5)+niz.get(pozicija-5) ;
        System.out.println("Suma je :" + suma);


    }
}
