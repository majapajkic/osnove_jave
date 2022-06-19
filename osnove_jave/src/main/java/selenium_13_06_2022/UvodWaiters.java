package selenium_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//Napisati program koji ucitava stranicu https://s.bootsnipp.com/iframe/klDWV i
//ceka da se ucita progress bar na 100% a zatim ispisuje tekst u konzoli “Stranica ucitana”

public class UvodWaiters {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.get("C:\\Users\\Maja\\Downloads\\Zadatak4.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.id("showInBtn")).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id-0")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("showInBtn")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id-0")));
//        wait.until(ExpectedConditions.attributeToBe(By.id("id-0"), "class", "milan"));
    }
}
