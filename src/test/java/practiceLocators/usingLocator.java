package practiceLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");

        //Locate the element
        By searchInputLocator = By.id("searchInput");

        //Find the element
        WebElement searchInputElement = driver.findElement(searchInputLocator);

        //Perform the action
        searchInputElement.click();

    }
}
