package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Zadatak (dok ne stignemo do ovog zadatka izguglajte kako da selektujete vrednost u select elementu)
//Napisati program koji ucitava stranicu https://www.ebay.com/ i bira kategoriju “Crafts”
public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        Select select = new Select(driver.findElement(By.name("_sacat")));
        select.selectByIndex(2);      //broji od nule
        Thread.sleep(2000);
        select.selectByValue("267");
        Thread.sleep(2000);
        select.selectByVisibleText("Crafts");
        Thread.sleep(2000);
        driver.quit();

    }
}
