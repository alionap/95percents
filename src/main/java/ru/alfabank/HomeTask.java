package ru.alfabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static java.lang.Thread.sleep;

/**
 * Created by а on 27.09.2017.
 */
public class HomeTask {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\а\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://alfabank.ru/");

        sleep(1000);

        WebElement bankCardsButton = driver.findElement(By.xpath("//*[@id=\"home_page\"]/div[1]/div[1]/div/div/div[4]/ul[1]/li[2]/a"));
        bankCardsButton.click();

        sleep(5000);

        WebElement creditCards = driver.findElement(By.xpath("//*[@id=\"product_page_list\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[7]/a"));
        creditCards.click();

        sleep(5000);

        WebElement selectCard = driver.findElement(By.xpath("//*[@id=\"product_page_list\"]/div[2]/div[2]/div[2]/div[1]/div[1]/button"));
        selectCard.click();

        WebElement masterCard = driver.findElement(By.xpath("//*[@id=\"product_page_list\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div/form/div/div[4]/div/div/div/div[1]/label"));
        masterCard.click();

        WebElement cardName = driver.findElement(By.xpath("//*[@id=\"product_page_list\"]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[38]/div/div[3]/h3/a"));
        System.out.println(cardName.getText());

        if (Objects.equals(cardName.getText(), "Visa Classic: 100 дней без %")){
            System.out.println("Удачный выбор!");
        }else {
            throw new Exception("Произошла ошибка!");
        }










    }
}
