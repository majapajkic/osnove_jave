package d20_05_2022;

public class FacebookPost {
    public String imeIprezimePost;
    public String imeIprezimeProfil;
    public String text;
    public int brojLajkova;
    public int brojDeljenja;

    public FacebookPost() {

    }

    public FacebookPost(String imeIprezimePost, String imeIprezimeProfil, String text) {
        this.imeIprezimePost = imeIprezimePost;
        this.imeIprezimeProfil = imeIprezimeProfil;
        this.text = text;
    }

    public int like() {
        return this.brojLajkova = this.brojLajkova + 1;
    }

    public int brojDislike() {
        if (this.brojLajkova > 0) {
            return this.brojLajkova - 1;
        } else return 0;
    }

    public int share() {
        return this.brojDeljenja = this.brojDeljenja + 1;
    }

    public void print() {
        System.out.println(this.imeIprezimePost + " >>> " + this.imeIprezimeProfil + this.text);
        System.out.println("Likes  " + this.brojLajkova + "  |  Shares  " + this.brojDeljenja);
    }
}
