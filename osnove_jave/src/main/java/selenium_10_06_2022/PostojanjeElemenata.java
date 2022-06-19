package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PostojanjeElemenata {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("file:///C:/Users/Dell/Downloads/Zadatak6.html");

        ///driver.findElement(By.id("showInBtn")).click();
        //if(elementExist(driver, By.id("id-0"))){
        /// System.out.println("");
        //}
        List<WebElement> elements = driver.findElements(By.id("id-0"));
        if (elements.size() > 0) {
            System.out.println("Element postoji.");
        } else {
            System.out.println("Element ne postoji");
        }
    }

    private static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}
