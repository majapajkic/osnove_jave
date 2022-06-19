package selenium_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

//Napisati program koji:
//Pre nego sto krenete u automatizaciju prvo sve korake uradite rucno
//Implicitno cekanje za trazenje elemenata je maksimalno 10s
//Implicitno cekanje za ucitavanje stranice je 5s
//Ucitava stranicu https://docs.katalon.com/
//Maksimizuje prozor
//Od html elementa cita data-theme atribut.
//Korisni linkovi za citanje vrednosti atributa link1 i link2
//Proverava da li je sadrzaj u tom atributu light i ispisuje odgovarajuce poruke
//Klikce na dugme za zamenu tema
//Ponovo cita data-theme atribut html elementa i validira da u atributu stoji vrednost dark
//Izvrsava kombinaciju tastera CTRL + K. Koristan link  za keyboard actions…kako izvrsavati precice preko Actions objekta
//Zatim od inputa za pretragu cita atribut type i proverava da je vrednost tog atributa search
//Zatvara pretrazivac
public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://docs.katalon.com/");
        driver.manage().window().maximize();

        String theme = driver.findElement(By.tagName("html")).getAttribute("data-theme");
        if (theme.equals("light")) {
            System.out.println("Pozadina je bela");
        } else {
            System.out.println("Pozadina je crna.");
        }
        driver
                .findElement(By.className("toggleButton_rCf9"))
                .click();

        theme = driver.findElement(By.tagName("html")).getAttribute("data-theme");
        if (theme.equals("dark")) {
            System.out.println("Pozadina je crna");
        } else {
            System.out.println("Pozadina je bela.");
        }
        Actions actions = new Actions(driver);
        actions
                .keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();

        String searchType = driver.findElement(By.id("docsearch-input")).getAttribute("type");
        if (searchType.equals("search")) {
            System.out.println("Sve je ok.");
        } else {
            System.out.println("Nije ok.");
        }

        driver.quit();
    }
}
