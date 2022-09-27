import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRadioButtons {

    public static void main(String[] args) {

        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/radio-button");

        WebElement radioButtonYes = driver.findElement(By.cssSelector("#yesRadio"));

        //scroll down to the button
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButtonYes);
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //click it

//        driver.executeScript("arguments[0].click()", radioButtonYes);
//        System.out.println("Radio button clicked!");

        //sau dam click pe label-ul de langa(Yes)
        WebElement labelYesRadio = driver.findElement(By.cssSelector("label[for=\"\\yesRadio\"]"));
        labelYesRadio.click();


        //isSelected(); - only on input elements!
        //isEnabled(); - only on input elements!

        driver.close();

    }
}
