package crossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBrowsingHandling {
    public static void main(String[] args) {
        String browserType = "chrome";

        //ChromeDriver driver;
        //FirefoxDriver firefox;
        //EdgeDriver edgeDriver;

        WebDriver driver;

        if(browserType.equals("chrome")){
             driver = new ChromeDriver();

        }else if (browserType.equals("firefox")){
            driver = new FirefoxDriver();
        }else if (browserType.equals("edge")){
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Wrong Driver");
        }
        driver.get("");
        //driver.quit();
        driver.manage().window().maximize();


    }
}
