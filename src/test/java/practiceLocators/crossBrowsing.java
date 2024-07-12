package practiceLocators;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBrowsing {
    public static void main(String[] args) {
        //Open browser in edge browser
        EdgeDriver driver = new EdgeDriver();

        //Open browser in Firefox
        //FirefoxDriver driver1 = new FirefoxDriver();

        //Maximize the page
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //Get title
        String title = driver.getTitle();

    }
}
