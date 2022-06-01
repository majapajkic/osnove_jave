package osobaIgracTrener;

public class OsobaIgracTrenerMain {
    public static void main(String[] args) {
        Igrac igrac1 = new Igrac("Mile Milic", "2406998710889", 1998, 21, "napadac", false);
        Igrac igrac2 = new Igrac("Dragi Milic", "0103000734555", 2000, 7, "odbrambeni", true);
        Trener trener1 = new Trener("Goran Ilic", "15061977345666", 1977, 19, "kondicioni");
        Trener trener2 = new Trener("Vasa Ilic", "15061981341222", 1981, 11, "personalni");
        igrac1.stampaj();
        igrac2.stampaj();
        trener1.stampaj();
        trener2.stampaj();
    }
}
