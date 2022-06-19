package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

/*Napisti proram koji :
Ucitava stranicu https://s.bootsnipp.com/iframe/oV91g
Hvatamo sve page-eve iz paginacije tabele
Zatim petljom prolazimo kroz paginaciju tako sto kliknemo na svaki broj
Izmedju iteracija napravite pauzu od 1s
Zatvorite pretrazivac*/

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://s.bootsnipp.com/iframe/oV91g";
        driver.get(url);

        List<WebElement> pagination =
                driver.findElements(By.xpath("/*[contains(@class, 'page_link')]"));
        for (int i = 0; i < pagination.size(); i++) {
            pagination.get(i).click();
            Thread.sleep(1000);
        }
        driver.quit();
    }
}
