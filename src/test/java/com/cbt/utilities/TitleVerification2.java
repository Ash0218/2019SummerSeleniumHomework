package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com, " +
                        "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.luluandgeorgia.com/");
        String title1 = driver.getTitle();
      //  String url1 = driver.getCurrentUrl();
        Thread.sleep(3000);

        driver.navigate().to("https://wayfair.com");
        String title2 = driver.getTitle();
      //  String url2 = driver.getCurrentUrl();
        Thread.sleep(3000);

        driver.navigate().to("https://walmart.com");
        String title3 = driver.getTitle();
     //   String url3 = driver.getCurrentUrl();
        Thread.sleep(3000);

        driver.navigate().to("https://www.westelm.com/?cm_type=gnav&cm_sp=GlobalLinks-_-Topnav-_-WestElmLogo");
        String title4 = driver.getTitle();
      //  String url4 = driver.getCurrentUrl();
        Thread.sleep(3000);

        if (title1.equalsIgnoreCase("Lulu and Georgia")){
            System.out.println("equal title1");
        } else {
            System.out.println("Title Not Equal");
        }

        if (title2.equalsIgnoreCase("Wayfair.com - Online Home Store for Furniture, Decor, Outdoors & More")){
            System.out.println("equal title2");
        } else {
            System.out.println("Title Not Equal");
        }

        if (title3.equalsIgnoreCase("Walmart.com | Save Money. Live Better.")){
            System.out.println("equal title3");
        } else {
            System.out.println("Title Not Equal");
        }

        if (title4.equalsIgnoreCase("Modern Furniture, Home Decor & Home Accessories | west elm")){
            System.out.println("equal title4");
        } else {
            System.out.println("Title Not Equal");
        }

        driver.close();














    }
}
