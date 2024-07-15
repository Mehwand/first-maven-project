package SeleniumWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usinglinkPartialLinkAndClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Sign in
        driver.findElement(By.linkText("Sign in")).click();

        //UserName login
        driver.findElement((By.name("email"))).sendKeys("Mehwands22@gmail.com");

        //Password Login
        driver.findElement(By.name("password")).sendKeys("Shah$1234");

        //Login Button
        driver.findElement((By.id("loginBtn"))).click();


    }
}
