package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = " http://the-internet.herokuapp.com/login";
        // Launch the chrome browser

        WebDriver driver = new ChromeDriver();
        // open the Url into browser

        driver.get(baseUrl);

        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // get the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        // get the page source
        System.out.println("Page source :" + driver.getPageSource());


        //Find the email element and type email
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Prime123@gmail.com");

        // find the password field element and type the password
        driver.findElement(By.name("password")).sendKeys("Prime123@");

        // close the browser
        driver.close();
    }
}