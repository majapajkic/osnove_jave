package d16_05_2022;
/* (Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
Primer izvrsenja:
izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
Napomena: Resiti bez koriscenja petlji.        */
public class DomaciZ5 {
    public static void main(String[] args) {
        int a=brojiCeleBrojeve(2, 3);
        System.out.println(a);
        int b=brojiCeleBrojeve(1, 10);
        System.out.println(b);
    } static int brojiCeleBrojeve (int m, int n){
        int brojCelih=n-m-1;
        return brojCelih;
    }

}
