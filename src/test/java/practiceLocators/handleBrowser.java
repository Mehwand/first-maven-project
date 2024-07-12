package practiceLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrowser {
    public static void main(String [] args){
        //Open Chrome Browser
        ChromeDriver driver = new ChromeDriver();

        //Use this method to maximize Browser
        driver.manage().window().maximize();

        //Navigate to the URL
        driver.get("https://www.wikipedia.org/");

        //Return String of application title
        String title = driver.getTitle();
        System.out.println(title);

        //To close the browser entirely
        driver.quit();
    }
}
