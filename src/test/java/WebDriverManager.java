import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    public static ChromeDriver createChromeDriver(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        return new ChromeDriver();

    }

    public static ChromeDriver getChromeDriveByManager(){
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
