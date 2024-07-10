package FirstAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrowser {
    public static void main(String [] args){
        //open browser crome browser
        ChromeDriver chromeDriver = new ChromeDriver();

        //Navigate to a url
        chromeDriver.get("https://google.com");
        chromeDriver.get("https://www.facebook.com/");

    }
}
