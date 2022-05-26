package d23_05_2022.AutorKnjiga;

public class AutorKnjigaMain {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setPunoIme("Branislav Nusic");
        autor1.print();
        Autor autor2 = new Autor();
        autor2.setPunoIme("Mirjana Bobic Mojsilovic");
        autor2.print();
        System.out.println();

        Knjiga knjiga1 = new Knjiga("jdfhksdjhdksf", "Hajduci", 1993, autor1);
        knjiga1.stampaj();
        Knjiga knjiga2 = new Knjiga("sdhdjkda", "Sumnjivo lice", 1990, autor1);
        knjiga2.stampaj();
        Knjiga knjiga3 = new Knjiga("jdfhkjjjhdksf", "Suze su OK", 2007, autor2);
        knjiga3.stampaj();
        Knjiga knjiga4 = new Knjiga("jdfhksddddksf", "Happy end", 2001, autor2);
        knjiga4.stampaj();

    }
}
