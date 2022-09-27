import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MySelenium {

    public static void main(String[] args) {

        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com");

        //NoSuchElementException
//        try{
//            WebElement card = driver.findElement(By.className("card1234"));
//            card.click();
//        } catch (NoSuchElementException e) {
//            System.out.println("Nu am reusit sa localizez card ul");
//
//        } finally{
//            driver.quit();
//            System.out.println("Inchidem driver ul");
//        }

        //ElementNotClickable
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{
            WebElement card = driver.findElement(By.className(".card"));
//            driver.navigate().refresh(); - pt staleelementexception
            card.click();
        } catch (NoSuchElementException e){
            System.out.println("Nu am reusit sa localizez card ul");

        } finally{
            driver.quit();
            System.out.println("Inchidem driver ul");
        }


        //ElementNotFoundException
        //ElementNotClickableException
        //StaleElementException - pierdere referinta
        //WebDriverException - eroare cu driverul



//        driver.quit();
//        System.out.println("Finish");


    }
}
