package selenium_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

//Napisati program koji ucitava stranicu https://www.file.io/ aploaduje fajl
//(ZA vezbanje)
//Probajte upload razlicitih fajlova, npr:
//fajl velciine 20mb => mozete da ga napravite tako sto zipujete grupu
// nekih fajlova, slika …
public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        File slika = new File("src/main/resources/2439.jpg");
        driver.navigate().to("https://www.file.io/");

        driver.findElement(By.id("upload-button")).sendKeys(slika.getAbsolutePath());

        Thread.sleep(10000);
        driver.quit();
    }
}
