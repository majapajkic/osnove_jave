package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UvodImplicitniWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("file:///C:/Users/Maja/Downloads/Zadatak6%20(1).html");

        driver.findElement(By.id("showInBtn")).click();
        System.out.println("Kliknuto");
        driver.findElement(By.id("id-0"));
        System.out.println("Nadjeno");

        driver.findElement(By.id("showInBtn")).click();
        driver.findElement(By.id("id-1"));

        System.out.println("KRAJ");
    }
}
