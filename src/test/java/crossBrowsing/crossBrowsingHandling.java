package crossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class crossBrowsingHandling {
    public static void main(String[] args) {

        Scanner scnObj = new Scanner(System.in);
        System.out.println("Enter your browser chrome, firefox, edge  ");
        String browserType = scnObj.nextLine();


        //ChromeDriver driver;
        //FirefoxDriver firefox;
        //EdgeDriver edgeDriver;

        WebDriver driver;

        if(browserType.equalsIgnoreCase("Chrome")){
             driver = new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if (browserType.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Wrong Driver");
        }
        driver.get("https://google.com");
        //driver.quit();
        driver.manage().window().maximize();


    }
}
