package d_09_06_Selenium;
//Napisati program koji vrsi dodavanje 5 reda u tabelu.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
        for (int i = 0; i < 5; i++) {
            WebElement button=driver.findElement(By.xpath("//button[contains(@class, 'btn btn-info add-new')]"));
            button.click();
            WebElement input=driver.findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr[4]/td/input"));
            input.sendKeys("Iva Ivic");
            WebElement input1=driver.findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr[4]/td[2]/input"));
            input1.sendKeys("Quality Assurance");
            WebElement input2=driver.findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr[4]/td[3]/input"));
            input2.sendKeys("(517)456-789");
            WebElement button1=driver.findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr[4]/td[4]/a/i"));
            button1.click();
            Thread.sleep(500);
        }
        driver.quit();
    }
}
