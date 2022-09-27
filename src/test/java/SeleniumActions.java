import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SeleniumActions {

    public static void main(String[] args) {
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com");

        //interactiuni cu mouse ul sau tastatura sau scroll sau whatever


        //move to element:

        List<WebElement> cards = driver.findElements(By.cssSelector(".card"));
        WebElement sixthCard = cards.get(5);

        //moving to that element - we need to scroll down in the page
        Actions actions = new Actions(driver);

        //moveToElement (scroll)
        actions.moveToElement(sixthCard);

        sixthCard.click();
        System.out.println("Am dat clickul");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        driver.quit();
    }


}
