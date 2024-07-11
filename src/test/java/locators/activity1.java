package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/auth/login");

        //Locate the element
        By searchInputLocator = By.id("email");

        //Find the element
        WebElement searchInputElement = driver.findElement(searchInputLocator);

        //perform the action

        searchInputElement.click();

    }
}
