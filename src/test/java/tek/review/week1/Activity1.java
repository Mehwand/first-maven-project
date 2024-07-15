package tek.review.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    /*
    In retail app, click on sign in then click on Create new account
    then fill up the form and sign up. Expection is to crate new account
    once account created make sure profile is displayed. (isDisplayed)
     */

    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");

        //Locate the element
        By signIn = By.id("signinLink");
        //Find the element
        WebElement signInElement = driver.findElement(signIn);
        //Action
        signInElement.click();

        By creatAccount = By.id("newAccountBtn");
        WebElement AccountElement = driver.findElement(creatAccount);
        AccountElement.click();

        By firstName = By.id("nameInput");
        WebElement firstNameElement = driver.findElement(firstName);
        firstNameElement.sendKeys("Mehwand Shah");

        By emailAddress = By.id("emailInput");
        WebElement emailAddressElement = driver.findElement(emailAddress);
        emailAddressElement.sendKeys("Mehwands1@gmail.com");

        By password = By.id("passwordInput");
        WebElement passwordElement = driver.findElement(password);
        passwordElement.sendKeys("Shah$1234");

        By confirmPassword = By.id("confirmPasswordInput");
        WebElement confirmPasswordElement = driver.findElement(confirmPassword);
        confirmPasswordElement.sendKeys("Shah$1234");

        By signUp = By.id("signupBtn");
        WebElement signUpElement = driver.findElement(signUp);
        signUpElement.click();



    }

}
