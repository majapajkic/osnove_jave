package d16_05_2022;
/* Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
 */


public class DomaciZ1 {
    public static void main(String[] args) {
        int a=stampajVrednostZa10Vecu(10);
        int b=stampajVrednostZa10Vecu(25);
        int c=stampajVrednostZa10Vecu(-10);
        int d=stampajVrednostZa10Vecu(789);
        System.out.println("Vrednost a uvecana 10 puta je: " + a);
        System.out.println("Vrednost b uvecana 10 puta je: " + b);
        System.out.println("Vrednost c uvecana 10 puta je: " + c);
        System.out.println("Vrednost d uvecana 10 puta je: " + d);
    }
    static int stampajVrednostZa10Vecu(int broj){
        return broj*10;
    }
}
