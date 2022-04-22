package demo.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessChrome {

    @Test
    public static void test1() throws InterruptedException {

        // Launch
        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
        //WebDriver  driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);

        // load the url
        try {
            driver.manage().window().maximize();

            driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

            Thread.sleep(2000);

            String value = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[1]/h2")).getText();

            Thread.sleep(2000);

            System.out.println(value);

        }
        catch (Exception e){
            System.out.println("exception");
        }
        finally {
            driver.quit();
        }

    }
}
