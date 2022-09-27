import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAlerts {

    public static void main(String[] args) {
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/alerts");

        //click pe primul buton, id alert btn
//        WebElement firstButton = driver.findElement(By.id("alertButton"));
//        firstButton.click();

        //cream un obiect de tipul alert si facem switch la el;
//        Alert alert = driver.switchTo().alert();
//        alert.accept(); //alerta a disparut, adica a fost acceptata

        //al doilea buton - dupa ce facem wait for element

        //a treia alerta - are un ok si un cancel

//        WebElement thirdButton = driver.findElement(By.id("confirmButton"));

        //facem scroll down
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", thir
//        );
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //click pe buton
//        thirdButton.click();
//        Alert alert = driver.switchTo().alert();

        //2 optiuni: accept
//        alert.accept();

        //sau dismiss
//        alert.dismiss();



       WebElement fourthButton = driver.findElement(By.id("promtButton"));
//      scroll to the button
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fourthButton);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fourthButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("abababa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert.accept();

        driver.close();
    }
}
