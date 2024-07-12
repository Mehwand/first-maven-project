package practiceLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class crossBrowsingHandling {
    public static void main(String[] args) {
        //Activity to find a way to ask users which browser to run.
        Scanner scnObj = new Scanner(System.in);
        System.out.println("choose browser Chrome, firefox, and edge");
        String browserType = scnObj.next();

        WebDriver driver;

        if(browserType.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }else{
            throw new RuntimeException("Wrong Driver");
        }
        driver.get("https://google.com");
    }
}
