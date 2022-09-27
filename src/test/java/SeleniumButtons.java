import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SeleniumButtons {

    public static void main(String[] args) {

        ChromeDriver driver = WebDriverManager.getChromeDriveByManager();
        driver.get("https://demoqa.com/buttons");

        //nu merge cu id, pt ca id ul se genereaza dinamic la fiecare refresh sau
        // deschidere de pagina

        //driver.findElement(By.id("##XVxY1")).click();

        //facem o lista cu cele 3 butoane, identificate dupa clasa
//        List<WebElement> buttons = driver.findElements(By.cssSelector(".btn.btn-primary"));
//        WebElement buttonClick = buttons.get(2);

        //we need to scroll down in the page
        Actions actions = new Actions(driver);
//        actions.moveToElement(buttonClick);

//        buttonClick.click();
//        System.out.println("Am dat clickul");


        //right click pe butonul de right click
//        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
//        actions.click().contextClick(rightClickButton);
//        System.out.println("Am dat right clickul");

        //double click on the double click button
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickButton);
        System.out.println("Am facut double click ul");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
