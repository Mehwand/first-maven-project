package FirstAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class activity {
    public static void main(String [] args){
        //go to the chrome browser
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        //To to maximize the page
        driver.manage().window().maximize();

        //Get the title
        String name = driver.getTitle();
        System.out.println(name);

    }
}
