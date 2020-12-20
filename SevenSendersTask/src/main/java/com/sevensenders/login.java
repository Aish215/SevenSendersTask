package com.sevensenders;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
            public void login() {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aishwarya\\IdeaProjects\\SevenSendersTask\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://komoot.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@type='button']")).click();



        //Test case for Login the website
        driver.findElement(By.id("email")).sendKeys("unknownuser@gmail.com");
        driver.findElement(By.className("css-qbizf4")).click();
        driver.findElement(By.id("display_name")).sendKeys("dummyuser@gmail.com");
        driver.findElement(By.id("password")).sendKeys("FakePassword");

        // Click on checkbox for newsletter
       driver.findElement(By.id("newsletter")).click();

       //To Sign Up
       driver.findElement(By.className("css-qbizf4")).click();







    }}