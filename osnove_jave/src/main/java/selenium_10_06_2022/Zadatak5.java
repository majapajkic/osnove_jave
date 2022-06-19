package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Ucitati stranicu https://demoqa.com/modal-dialogs
//Kliknuti na dugme Large modal
//Proverite da li se prikazao dijalog i ispisite u konzoli odgovarajuce poruke
public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs/");
        driver.findElement(By.id("showLargeModal")).click();
        if(elementExist(driver, By.id("example-modal-sizes-title-lg"))){
            System.out.println("Dijalog postoji");
        }else{
            System.out.println("Dijalog ne postoji");
        }

    }

    private static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist=true;
        try{
            driver.findElement(by);
        }catch(Exception e){
            elementExist=false;
        }
        return elementExist;
    }
}
