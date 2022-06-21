package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditDialogPage {
    private WebDriver driver;

    public EditDialogPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstNameInput() {
        return driver.findElement(By.id("fn"));
    }

    public WebElement getLastNameInput() {
        return driver.findElement(By.id("ln"));
    }

    public WebElement getMiddleNameInput() {
        return driver.findElement(By.id("mn"));
    }

    public WebElement getUpdateButton() {
        return driver.findElement(By.id("up"));
    }

    public void waitForDialogToBeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit")));
    }

    public void waitForDialogToBeInvisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("edit")));
    }
}