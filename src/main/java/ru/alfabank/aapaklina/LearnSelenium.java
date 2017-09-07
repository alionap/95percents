package ru.alfabank.aapaklina;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static java.lang.Thread.sleep;

public class LearnSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\а\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://temp-mail.ru/");

        sleep(1000);

        String emailAddress = driver1.findElement(By.xpath("//*[@id=\"mail\"]")).getAttribute("value");

        driver1.close();

        WebDriver driver = new ChromeDriver();
        driver.get("https://dzone.com");

        WebElement singUpButton = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[1]/div/div/div[1]/div/div[2]/div[2]/a[2]"));
        singUpButton.click();

        sleep(5000);

        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div[2]/users-sign-in-form/div[3]/form/div[1]/input"));
        textBox.sendKeys(emailAddress);

        WebElement singUp = driver.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div[2]/users-sign-in-form/div[3]/form/div[2]/button"));
        singUp.click();

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        firstName.sendKeys("Alena");

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastName.sendKeys("Paklina");

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys(emailAddress);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("aliona20");

        WebElement confirmPassword = driver.findElement(By.xpath("//*[@id=\"confPass\"]"));
        confirmPassword.sendKeys("aliona20");

        sleep(1000);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/button"));
        continueButton.click();

        sleep(5000);

        WebElement laterButton = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/a"));
        laterButton.click();

        sleep(5000);

        WebElement name = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[1]/div/div/div[1]/div/div[2]/div[2]/span"));
        System.out.println(name.getText());

        if (Objects.equals(name.getText(), "Alena")) {
            System.out.println("Регистрация прошла успешно");
        } else {
            System.out.println("Вы не зарегистрированы");
        }


        driver.close();

    }
}
