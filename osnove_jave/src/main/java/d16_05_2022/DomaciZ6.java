package d16_05_2022;
/*  (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
 U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
 */
public class DomaciZ6 {
    public static void main(String[] args) {
        int najmanji= vracaNajmanji(2, 5, 7);
        System.out.println("Najmanji je broj: " + najmanji);
        int najmanji2=vracaNajmanji(8,6,9);
        System.out.println("Najmanji je broj: " + najmanji2);
    } static int vracaNajmanji(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }else if (b<a && b<c){
            return b;
    }else{
            return c;
        }
    }
}
