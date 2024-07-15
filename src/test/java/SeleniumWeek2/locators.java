package SeleniumWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.className("top-nav__btn")).click();
        //driver.findElement(By.name("email")).sendKeys("Mehwands@gmail.com");
        //driver.findElement(By.name("password")).sendKeys("Shah$1234");
        //driver.findElement(By.id("loginBtn")).click();

        //Lets work with cssSelectors
        //Tag and id
        //driver.findElement(By.cssSelector("input#email")).sendKeys("Mehwands@gmail.com");
        //driver.findElement(By.cssSelector("input#password")).sendKeys("Shah$1234");
        //driver.findElement((By.cssSelector("button#loginBtn"))).click();

        //Tag and class cssSelector
        //driver.findElement(By.cssSelector("input.login__input")).sendKeys("Mehwands@gmail.com");
        //driver.findElement(By.cssSelector("input.login__input")).sendKeys("Shah$1234");
        //driver.findElement(By.cssSelector("button.w-full  login__invalid login__submit")).click();







    }

}
