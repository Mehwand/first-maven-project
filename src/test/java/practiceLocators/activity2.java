package practiceLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class activity2 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");

        //maximize window
        driver.manage().window().maximize();

        //Print title
        String title = driver.getTitle();
        System.out.println(title);

        //close browser
        driver.quit();
    }
}
