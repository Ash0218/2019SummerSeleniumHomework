package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {
        // Chrome, Firefox, safari

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        System.out.println(title2);
        driver.navigate().back();
        String title3 = driver.getTitle();

        if(title.equals(title3)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        driver.navigate().forward();
        String title4 = driver.getTitle();

        if(title2.equals(title4)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        Thread.sleep(3000);
        driver.quit();



        WebDriver driver1 = BrowserFactory.getDriver("firefox");
        driver1.manage().window().maximize();
        driver1.get("http://google.com");
        String titleG = driver1.getTitle();
        System.out.println(titleG);
        driver1.navigate().to("http://etsy.com");
        String titleG2 = driver1.getTitle();
        System.out.println(titleG2);
        driver1.navigate().back();
        String titleG3 = driver1.getTitle();
        if(titleG.equals(titleG3)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        driver1.navigate().forward();
        String titleG4 = driver1.getTitle();

        if(titleG2.equals(titleG4)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        Thread.sleep(3000);
        driver1.quit();



        WebDriver driver2 = BrowserFactory.getDriver("safari");
        driver2.manage().window().maximize();
        driver2.get("http://google.com");
        String titleS = driver2.getTitle();
        System.out.println(titleS);
        driver2.navigate().to("http://etsy.com");
        String titleS2 = driver2.getTitle();
        System.out.println(titleS2);
        driver2.navigate().back();
        String titleS3 = driver2.getTitle();
        if(titleS3.equals(titleS)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        driver2.navigate().forward();
        String titleS4 = driver2.getTitle();

        if(titleS4.equals(titleS2)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        Thread.sleep(3000);
        driver2.quit();






    }
}
