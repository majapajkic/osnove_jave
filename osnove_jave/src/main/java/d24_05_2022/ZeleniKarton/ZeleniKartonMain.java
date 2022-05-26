package d24_05_2022.ZeleniKarton;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> zeleniKarton = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Unesite ime studenta: ");
            String punoIme = s.next();
            System.out.println("Unesite naziv predmeta: ");
            String nazivPredmeta = s.next();
            System.out.println("Unesite ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton zk1 = new ZeleniKarton(punoIme, nazivPredmeta, ocena);
            zeleniKarton.add(zk1);
            System.out.println("Ime studenta je: " + zeleniKarton.get(i).getPunoIme() +
                    ", naziv predmeta je: " + zeleniKarton.get(i).getNazivPredmeta() +
                    ", ocena na ispitu je: " + zeleniKarton.get(i).getOcena());
        }
        System.out.println();

        double prosecnaOcena = 0;
        for (int i = 0; i < zeleniKarton.size(); i++) {
            prosecnaOcena = prosecnaOcena + zeleniKarton.get(i).getOcena();
        }
        System.out.println("Prosecna ocena je: " + prosecnaOcena / zeleniKarton.size());

        double prosecnaOcenaPolozeni = 0;
        int brojPolozenih = 0;
        for (int i = 0; i < zeleniKarton.size(); i++) {
            if (zeleniKarton.get(i).getOcena() > 5) {
                brojPolozenih = brojPolozenih + 1;
                prosecnaOcenaPolozeni = prosecnaOcenaPolozeni + zeleniKarton.get(i).getOcena();
            }
        }
        System.out.println("Prosecna ocena polozenih je: " + prosecnaOcenaPolozeni / brojPolozenih);
    }
}
