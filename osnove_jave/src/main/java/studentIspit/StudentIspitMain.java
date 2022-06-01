package studentIspit;

public class StudentIspitMain {
    public static void main(String[] args) {
        Ispit ispit1 = new Ispit("QA", 9, "Milan Jovanovic");
        Ispit ispit2 = new Ispit("QA", 10, "Vladimir Minic");
        Ispit ispit3 = new Ispit("Baze Podataka", 5, "Milan Jovanovic");
        Student student1 = new Student(1055, "Mila Milic", "master");
        student1.dodajIspit(ispit1);
        student1.dodajIspit(ispit2);
        student1.dodajIspit(ispit3);
        if(ispit1.daLiJePolozen()){
            System.out.println("Ispit QA je polozen.");
        }else{
            System.out.println("Ispit QA nije polozen");
        }
        student1.prosekNaStudijama();
        student1.stampaj();
    }
}
