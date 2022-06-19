package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Ucitava stranicu https://demoqa.com/login
//Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//Zatim ceka 5sekundi da se korisnik uloguje
//Proverava da li se korisnik ulogovao, tako sto se proverava postojanje dugmeta Logout. Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//Klikce na dugme za logout
//Gasi stranicu
public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/login/";
        String username = "itbootcamp";
        String password = "ITBootcamp2021!";

        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver
                .findElement(By.id("userName"))
                .sendKeys(username);
        driver
                .findElement(By.xpath("//*[@placeholder='Password']"))
                .sendKeys(password);
        driver
                .findElement(By.xpath("//form[@id='userForm']/div[contains(@class,'buttonWrap')]/div/button"))
                .click();

        Thread.sleep(5000);
        if (elementExist(driver, By.xpath("//button[text()='Log out']"))) {
            driver
                    .findElement(By.xpath("//button[text()='Log out']"))
                    .click();
        } else {
            System.out.println("Neuspesan login.");
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

