package d16_05_2022;
/*Metoda prima dva parametra: N i karakter za stampu. Metoda stampa N karaktera.
Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/ / / / /                   */
public class DomaciZ4 {
    public static void main(String[] args) {
      stampa(5,'/');
    }
    static void stampa(int n, char k){
        for (int i=0; i < n; i++) {
            System.out.print(k);
        }
    }
}
