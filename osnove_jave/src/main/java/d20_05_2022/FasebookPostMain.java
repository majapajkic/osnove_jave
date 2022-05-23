package d20_05_2022;

public class FasebookPostMain {
    public static void main(String[] args) {
        FacebookPost a = new FacebookPost();
        a.imeIprezimePost = "Mila Milic";
        a.imeIprezimeProfil = "Ana Anic\n";
        a.text = "Cao svima. Sta mislite koliko ce biti vruce ovo leto i gde cemo moci da se rashladimo. \nMore, planina ili  " +
                "debela hladovina ispod nekog drveta, npr.lipe? Kazu da ima najbolji hlad.....";
        a.like();
        a.brojDislike();
        //a.share();
        a.print();
        System.out.println();
        FacebookPost b = new FacebookPost();
        b.imeIprezimePost = "Marko Markovic";
        b.imeIprezimeProfil = "Luka Lukic\n";
        b.text = "Blizi se kraj kursa. Prva kafana je prosla ka puckica, bombonica... \nKako se vama cini....Ja sam odusevljena...";
        b.like();
        b.brojDislike();
        //b.share();
        b.print();
    }
}
