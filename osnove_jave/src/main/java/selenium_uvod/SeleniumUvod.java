package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUvod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://cms.demo.katalon.com/https://cms.demo.katalon.com/");
//WebElement input= driver.findElement(By.xpath("//input[@name='s']"));
//driver.findElement(By.xpath("//input[@name='s']"));
        driver
                .findElement(By.xpath("//input[@name='s']"))
                .sendKeys("Shoes");
        Thread.sleep(2000);

        driver
                .findElement(By.xpath("//input[@id='gh-btn']"))
                .click();

        driver.quit();

    }
}
