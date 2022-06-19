package selenium_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

//Napisati program testira upload funkcionalnost: Koristan link https://www.guru99.com/upload-download-file-selenium-webdriver.html
//Ucitava stranicu https://crop-circle.imageonline.co/#circlecropresult
//Uploadujte sliku na sajt
//Kliknite na dugme Crop Circle
public class Zadatak2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        File slika = new File("src/main/resources/2439.jpg");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://crop-circle.imageonline.co/#circlecropresult");
        driver.manage().window().maximize();
        new Actions(driver)
                .scrollToElement(driver.findElement(By.id("photobutton")))
                .perform();

        driver.findElement(By.name("file")).sendKeys(slika.getAbsolutePath());


    }
}
