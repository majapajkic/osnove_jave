package Testng_14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.time.Duration;

//visitsTheLoginUrl
public class UvodTestNg {

    private WebDriver driver;
    private String baseUrl = "https://www.google.com";     //base url je BEZ kose crte

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @Test(priority = 10)
    public void googleTitleTest() {
//        if(driver.getTitle().equals("Google")){
//            System.out.println("OK");
//        }else{
//            System.out.println("Nije ok.");
//        }
        Assert.assertEquals
                (driver.getTitle(), "Google1",
                        "Page title is not valid ");

        Assert.assertTrue(driver.getTitle().contains("Google1"),
                "[ERROR]Page title does not contain 'Google1'");

        driver.get(baseUrl + "/");         //home stranica
        driver.get(baseUrl + "/login");
        driver.get(baseUrl + "/register");

        String actualSearchType = driver.findElement(By.className("q")).getAttribute("type");
        Assert.assertEquals(
                actualSearchType,
                "text",
                "[ERROR] Input search is not type text.");
    }

    @Test(priority = 20)
    public void googleUrlTest() {

        if (driver.getCurrentUrl().contains("google.com")) {
            System.out.println("OK");
        } else {
            System.out.println("Nije ok.");
        }
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AFTER METHOD");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
