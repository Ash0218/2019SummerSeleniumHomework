package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringUtility {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.com/");

        String actual = driver.getTitle();
        String expected = "Cybertek";
        if (actual.equals(expected)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        Thread.sleep(3000);

        driver.close();

    }
}
