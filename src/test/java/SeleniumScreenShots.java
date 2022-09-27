import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SeleniumScreenShots {

    public static void main(String[] args) throws IOException {
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com");

        try{
            List<WebElement> cards = driver.findElements(By.cssSelector(".card"));
            WebElement sixthCard = cards.get(5);

            //moving to that element - we need to scroll down in the page
            Actions actions = new Actions(driver);
            actions.moveToElement(sixthCard).build().perform();

            sixthCard.click();
            System.out.println("Am dat clickul");

            File file = driver.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File("src/test/resources/screenshot.png");
            FileUtils.copyFile(file, destinationFile);

        } finally {
            driver.quit();
        }
    }
}
