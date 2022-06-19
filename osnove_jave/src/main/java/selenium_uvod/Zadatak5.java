package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

/*Napisti program koji:
Ucitava stranicu https://s.bootsnipp.com/iframe/z80en
Hvata sve elemente prve kolone i stampa tekst svakog elementa. Kako da od nekog elementa procitamo tekst imate na sledecem linku
Ceka 1s
Hvata sve element prvog reda i stampa tekst svakog elementa
Ceka 5s
Zatvara pretrazivac*/

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = " https://s.bootsnipp.com/iframe/z80en";
        driver.navigate().to(url);

        String s = driver.findElement(By.tagName("body")).getText();
        System.out.println(s);
        System.out.println("COLUMN:");
        List<WebElement> column =
                driver.findElements(By.xpath("//*[@id='lorem']/table/tbody/tr/td[1]"));
        for (int i = 0; i < column.size(); i++) {
            String text = column.get(i).getText();
            System.out.println(text);
            Thread.sleep(1000);
        }
        System.out.println("ROW:");
        List<WebElement> row =
                driver.findElements(By.xpath("//*[@id='lorem']/table/tbody/tr[1]/td"));
        for (int i = 0; i < row.size(); i++) {
            String text = row.get(i).getText();
            System.out.println(text);
            Thread.sleep(5000);
        }
        driver.quit();
    }
}
