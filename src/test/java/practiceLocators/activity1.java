package practiceLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity1 {
    /*
    In retail app click on Sign in and then enter email and password and
    then click on login
    Then push your code to gitHub repository
     */
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/auth/login");

        //Locate the element
        By SignInLocator = By.id("email");

        //Locate the element
        WebElement signInElement = driver.findElement(SignInLocator);

        //Perform the action
        signInElement.sendKeys("Mehwands@gmail.com");

        //Now perform the same automation on the password

        //Locate the element
        By signInLocator = By.id("password");

        //Find the element
        WebElement emailInputElement = driver.findElement(signInLocator);

        //Perform the action
        emailInputElement.sendKeys("Shah$123");

        //Now you have to press the button

        //Locate the element
        By logInBtn = By.id("loginBtn");

        //Find the element
        WebElement logInBtnElement = driver.findElement(logInBtn);

        //perform the action
        logInBtnElement.click();
    }
}
