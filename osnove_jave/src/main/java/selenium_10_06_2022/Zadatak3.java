package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

//Napisati program koji:
//Ucitava stranicu  https://www.ebay.com/
//Zatim iz selekta za kategoriju povlaci sve opcije. Koristan link
//Zatim bira random element iz niza opcija koristeci Random. Vodite racuna da random element
// bude u opsegu broja elemenata niza. Random podsetnik
//Selektuje random kategoriju izabranu u koraku iznad
//Zatvara pretrazivac
public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        Select select = new Select(driver.findElement(By.name("_sacat")));
        List<WebElement> options = select.getOptions();

        Random random = new Random();
        int randomIndex = random.nextInt(options.size());
        select.selectByIndex(randomIndex);
        Thread.sleep(2000);

        randomIndex = random.nextInt(options.size());
        String text = options.get(randomIndex).getText();
        select.selectByVisibleText(text);
        driver.quit();


    }
}
