package d18_05_2022;

/* Napisati klasu Proizvod koja ima atribute
naziv proizvoda (String)
cenu proizvoda (double)
težinu proizvoda u gramima. (double)
	i metode:
stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.   */
public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaPodataka() {
        System.out.println("Naziv proizvoda: " + this.naziv + ", cena proizvoda: " + this.cena +
                ", tezina: " + this.tezina);
    }
}
