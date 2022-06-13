package d_09_06_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        Scanner s=new Scanner(System.in);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://s.bootsnipp.com/iframe/WaXlr");
        List<WebElement> dugmici=driver.findElements(By.xpath("//*[contains(@id, 'rating-star')]"));
        System.out.println("Unesite broj od 1 do 5: ");
        int n=s.nextInt();
        for (int i = 0; i < dugmici.size(); i++) {
           dugmici.get(n).click();
        }
        driver.quit();

    }
}
