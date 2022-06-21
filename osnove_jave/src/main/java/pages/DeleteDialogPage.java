package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteDialogPage {
    private WebDriver driver;

    public DeleteDialogPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.id("del"));
    }

    public void waitForDialogToBeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delete")));
    }

    public void waitForDialogToBeInvisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("delete")));
    }
}
