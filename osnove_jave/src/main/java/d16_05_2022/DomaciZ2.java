package d16_05_2022;
/* Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
 vraca novu vrednost koja se formira kao na primeru:
ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.     */


public class DomaciZ2 {
    public static void main(String[] args) {
        vracaNovuVrednost(5,8);
        vracaNovuVrednost(2, 9);
        vracaNovuVrednost(9,1);
    }
    static void vracaNovuVrednost (int a, int b) {
        System.out.print(a);
        System.out.println(b);
    }
}
