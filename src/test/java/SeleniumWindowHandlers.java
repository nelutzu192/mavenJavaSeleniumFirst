import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumWindowHandlers {

    public static void main(String[] args) {

        ChromeDriver driver = null;

        try{
            driver = WebDriverManager.getChromeDriveByManager();
            driver.get("https://demoqa.com/browser-windows");

            WebElement tabButton = driver.findElement(By.id("tabButton"));
            tabButton.click();


            String parentWindow = driver.getWindowHandle(); //returns an id of the window opened at current time
            Set<String> windowHandles = driver.getWindowHandles(); //returns a list of ids ..../..
            //switch focus to a different window thatn the parrent window
            for (String window:windowHandles){
                if (!window.equals(parentWindow)){
                    driver.switchTo().window(window);
                    break;
                }

            }

            System.out.println(driver.findElement(By.id("sampleHeading")).getText());

            //inchidem tabul de sample page
            driver.close();

            //switch back to parent window:
            driver.switchTo().window(parentWindow);

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            //scroll to second button
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("windowButton")));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            //click on the 2nd button
            driver.findElement(By.id("windowButton")).click();

            //verificam din nou ce window handles avem:
            windowHandles = driver.getWindowHandles();

            //refacem switch ul la un window care nu e parent
            for (String window:windowHandles){
                if (!window.equals(parentWindow)){
                    driver.switchTo().window(window);
                    break;
                }

            }

            System.out.println(driver.findElement(By.id("sampleHeading")).getText());

            System.out.println("finish");

        } finally {
            if (driver != null){
                driver.quit();
            }

        }




    }
}
