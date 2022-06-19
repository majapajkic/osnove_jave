package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//Napisati program koji ucitava stranicu Zadatak6.html
//I na stranici dodaje 5 poruka “IT Bootcamp”
//Potrebno  je u svakoj iteraciji kliknuti na dugme Show in
//Sacekati da se novi element pojavi pre nego sto se doda sledeci
public class Zadatak6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("file:///C:/Users/Dell/Downloads/Zadatak6.html");
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("showInBtn")).click();
            driver.findElement(By.id("id-" + i));
            // driver.findElement(By.xpath("//body/div[last() + 1]"));
        }
        driver.quit();
    }

    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}
