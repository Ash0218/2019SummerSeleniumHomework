package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        String title = driver.getTitle();
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        Thread.sleep(3000);
        String title2 = driver.getTitle();
        driver.navigate().to("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();

        if (title.equals(title2)){
            System.out.println("Same Title");
        } else if (title.equals(title3)){
            System.out.println("Same Title");
        } else if (title2.equals(title3)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        String url1 = driver.getCurrentUrl();
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        String url2 = driver.getCurrentUrl();
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/login");
        String url3 = driver.getCurrentUrl();
        Thread.sleep(3000);
        String startswithURL = "http://practice.cybertekschool.com";

        if (url1.startsWith(startswithURL)){
            System.out.println(url1 + " starts with "+ startswithURL);
        } else if (url2.startsWith(startswithURL)){
            System.out.println(url2 +" starts with "+ startswithURL);
        } else if (url3.startsWith(startswithURL)){
            System.out.println(url3 + " starts with "+ startswithURL);
        } else {
            System.out.println("Not Match");
        }

        Thread.sleep(3000);

        driver.close();









    }
}
