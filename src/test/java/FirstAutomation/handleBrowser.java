package FirstAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrowser {
    public static void main(String [] args){
        //open browser chrome browser
        ChromeDriver chromeDriver = new ChromeDriver();

        //Navigate to a url
        chromeDriver.get("https://google.com");
        String title = chromeDriver.getTitle();
        System.out.println(title);
        chromeDriver.get("https://www.facebook.com/");
        //chromeDriver.manage().window().maximize();
        //chromeDriver.manage().window().minimize();
        //chromeDriver.manage().window().fullscreen();

        //To close browser entirely
        //chromeDriver.quit();
       // String title = chromeDriver.getTitle();
        //System.out.println(title);
    }
}
