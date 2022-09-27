import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tests {

    public static void test1(){

        WebDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://www.google.com");

        //inchide un tab
//        driver.close();

        //inchidem tot driverul
        driver.quit();

    }

    public static void testWebTable(){

        WebDriver driver = WebDriverManager.createChromeDriver();
        driver.get("http://testpages.herokuapp.com/styled/tag/dynamic-table.html");

        WebElement tableCaption = driver.findElement(By.cssSelector("table#dynamictable caption"));
        System.out.println("Textul din table caption: "+ tableCaption.getText());


        //create a list with all rows as web elements
        List<WebElement> tableRows = driver.findElements(By.cssSelector("table#dynamictable tr"));


        //extract data from line 1
        WebElement firstRow = tableRows.get(0);

        List<WebElement> firstRowColumns = driver.findElements(By.cssSelector("table#dynamictable th"));
        System.out.println("Header linia 1 coloana 1: " + firstRowColumns.get(0).getText());
        System.out.println("Header linia 1 coloana 2: " + firstRowColumns.get(1).getText());


        //extract data from line 2
        WebElement secondRow = tableRows.get(1);
        List<WebElement> secondRowColumns = secondRow.findElements(By.cssSelector("td"));
        System.out.println("Header linia 2 coloana 1: " + secondRowColumns.get(0).getText());
        System.out.println("Header linia 2 coloana 2: " + secondRowColumns.get(1).getText());

        //extract data from line 3
        WebElement thirdRow = tableRows.get(2);
        List<WebElement> thirdRowColumns = thirdRow.findElements(By.cssSelector("td"));
        System.out.println("Header linia 3 coloana 1: " + thirdRowColumns.get(0).getText());
        System.out.println("Header linia 3 coloana 2: " + thirdRowColumns.get(1).getText());

        driver.quit();

    }

    public static void testDynamicWebPage(){

        WebDriver driver = WebDriverManager.createChromeDriver();
        driver.get("http://testpages.herokuapp.com/styled/tag/dynamic-table.html");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //click details summary
        WebElement detailsSummary = driver.findElement(By.cssSelector("details summary"));
        detailsSummary.click();

        //interact with caption field
        WebElement captionField = driver.findElement(By.cssSelector("#caption"));

        //clear text
        captionField.clear();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //introducem text nou
        captionField.sendKeys("text introdus de noi");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    public static void main(String[] args) {
//        test1();

//        testWebTable();

        testDynamicWebPage();
    }

}
