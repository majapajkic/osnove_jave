package Testng_14_06_2022;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KatalonLoginTests {

    private WebDriver driver;
    private String baseUrl = " https://cms.demo.katalon.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @Test(priority = 10)
    public void visitLoginPageFromNavBar() {
        driver.get(baseUrl + "/");
        driver
                .findElement(By.linkText("MY ACCOUNT"))
                .click();
        Assert.assertEquals(
                driver.getTitle(),
                "My account – Katalon Shop",
                "[ERROR] Page title does not contain 'My account – Katalon Shop' ");
        Assert.assertTrue(
                driver.getCurrentUrl().contains("/my-account"),
                "URL dos not contain '/my-account' ");
    }

    @Test(priority = 20)
    public void checkInputTypes() {
        driver.get(baseUrl + "/my-account");
        Assert.assertEquals(
                driver.findElement(By.name("username")).getAttribute("type"),
                "text",
                "[ERROR] Email input does not have valid type.");
        Assert.assertEquals(
                driver.findElement(By.name("password")).getAttribute("type"),
                "password",
                "[ERROR] Password input does not have valid type.");
        Assert.assertEquals(
                driver.findElement(By.name("rememberme")).getAttribute("type"),
                "checkbox",
                "[ERROR] Checkbox remember me does not have valid type.");
        Assert.assertFalse(driver.findElement(By.name("rememberme")).isSelected(),
                "Remember me checkbox should me unchecked.");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}