package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

public class TitleVerification3 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driverC1 = BrowserFactory.getDriver("chrome");
        driverC1.manage().window().maximize();
        driverC1.get("http://google.com");
        String title = driverC1.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
        driverC1.quit();

        WebDriver driverC2 = BrowserFactory.getDriver("chrome");
        driverC2.manage().window().maximize();
        driverC2.get("http://etsy.com");
        String title2 = driverC2.getTitle();
        System.out.println(title2);
        Thread.sleep(3000);
        driverC2.quit();

        WebDriver driverC3 = BrowserFactory.getDriver("chrome");
        driverC3.manage().window().maximize();
        driverC3.get("http://google.com");
        String title3 = driverC3.getTitle();
        System.out.println(title3);
        Thread.sleep(3000);
        driverC3.quit();

        WebDriver driverC4 = BrowserFactory.getDriver("chrome");
        driverC4.manage().window().maximize();
        driverC4.get("http://etsy.com");
        String title4 = driverC4.getTitle();
        System.out.println(title4);
        Thread.sleep(3000);
        driverC4.quit();

        if(title.equals(title3)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        if(title2.equals(title4)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }



        WebDriver driverF1 = BrowserFactory.getDriver("firefox");
        driverF1.manage().window().maximize();
        driverF1.get("http://google.com");
        String titleG = driverF1.getTitle();
        System.out.println(titleG);
        Thread.sleep(3000);
        driverF1.quit();

        WebDriver driverF2 = BrowserFactory.getDriver("firefox");
        driverF2.manage().window().maximize();
        driverF2.navigate().to("http://etsy.com");
        String titleG2 = driverF2.getTitle();
        System.out.println(titleG2);
        Thread.sleep(3000);
        driverF2.quit();


        WebDriver driverF3 = BrowserFactory.getDriver("firefox");
        driverF3.manage().window().maximize();
        driverF3.get("http://google.com");
        String titleG3 = driverF3.getTitle();
        System.out.println(titleG3);
        Thread.sleep(3000);
        driverF3.quit();


        WebDriver driverF4 = BrowserFactory.getDriver("firefox");
        driverF4.manage().window().maximize();
        driverF4.navigate().to("http://etsy.com");
        String titleG4 = driverF4.getTitle();
        System.out.println(titleG4);
        Thread.sleep(3000);
        driverF4.quit();

        if(titleG.equals(titleG3)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        if(titleG2.equals(titleG4)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }




        WebDriver driverS1 = BrowserFactory.getDriver("safari");
        driverS1.manage().window().maximize();
        driverS1.get("http://google.com");
        String titleS1 = driverS1.getTitle();
        System.out.println(titleS1);
        Thread.sleep(3000);
        driverS1.quit();


        WebDriver driverS2 = BrowserFactory.getDriver("safari");
        driverS2.manage().window().maximize();
        driverS2.navigate().to("http://etsy.com");
        String titleS2 = driverS2.getTitle();
        System.out.println(titleS2);
        Thread.sleep(3000);
        driverS2.quit();


        WebDriver driverS3 = BrowserFactory.getDriver("safari");
        driverS3.manage().window().maximize();
        driverS3.get("http://google.com");
        String titleS3 = driverS3.getTitle();
        System.out.println(titleS3);
        Thread.sleep(3000);
        driverS3.quit();


        WebDriver driverS4 = BrowserFactory.getDriver("safari");
        driverS4.manage().window().maximize();
        driverS4.navigate().to("http://etsy.com");
        String titleS4 = driverS4.getTitle();
        System.out.println(titleS4);
        Thread.sleep(3000);
        driverS4.quit();

        if(titleS3.equals(titleS1)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }

        if(titleS4.equals(titleS2)){
            System.out.println("Same Title");
        } else {
            System.out.println("Different Title");
        }




    }
}
