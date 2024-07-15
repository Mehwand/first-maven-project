package SeleniumWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //In retail app go to create new account and create new account
        //use name, id, linkText or anything that is available
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        //Click on sign in button
        driver.findElement(By.className("top-nav__btn")).click();

        //Click on create new account
        driver.findElement(By.id("newAccountBtn")).click();

        //FirstName
        driver.findElement(By.id("nameInput")).sendKeys("Shah");

        //Email
        driver.findElement((By.name("email"))).sendKeys("mshah123@gmail.com");

        //password
        driver.findElement((By.name("password"))).sendKeys("Musawir$123");

        //Confirm password
        driver.findElement(By.name("confirmPassword")).sendKeys("Musawir$123");

        //SignUp
        driver.findElement(By.className("signup__btn")).click();

    }
}
