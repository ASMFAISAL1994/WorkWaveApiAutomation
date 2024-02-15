package POM;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.table.TableRowSorter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebElement {

    WebDriver driver;

    public WebElement(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }


    public void SignupLogin() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//li[@id='anonSignup']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("asmfaisal94+adn@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("01623928456");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='login']")).click();
        Thread.sleep(1000);
//        driver.get("https://mail.google.com/");







    }

    public void UsersInfo() throws InterruptedException {
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Please enter your phone number']")).sendKeys("01555330330");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Verification Code']")).sendKeys("123456");
//       Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Minimum 6 characters with a number and a letter']")).sendKeys("Faisa@#330");
//       Thread.sleep(1000);
       driver.findElement(By.xpath("//span[@id='month']")).click();
//       Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='December']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='day']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@value='19']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='year']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@value='1994']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='gender']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@value='male']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your first and last name']")).sendKeys("ASM FAISAL");
//        Thread.sleep(1000);
    }
    public void ClickGoogle() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Google']")).click();
//        Thread.sleep(7000);

    }
    public void UserProvideEmailPassword() throws InterruptedException {
        String mainWindowHandle = driver.getWindowHandle();
        // Switch to the new window
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        // Now  in the new window, interact with elements using XPath
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("a.s.m.faisal@g.bracu.ac.bd");
//        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        Thread.sleep(9000);

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("01623928456");
//        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        Thread.sleep(5000);

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
        Thread.sleep(6000);


        driver.findElement(By.xpath("//input[@placeholder='Search in Daraz']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search in Daraz']")).sendKeys("Daraz New Jp Desing Soft & Comfortable T-shirt For Men");
//        Thread.sleep(2000);

    }
    public void UserWillClickSerach() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='search-box__button--1oH7']")).click();
       Thread.sleep(3000);
    }
    public void UserChooseProduct() throws InterruptedException {

        driver.findElement(By.xpath("//img[@alt='Daraz New Jp Desing Soft & Comfortable T-shirt For Men']")).click();
//        Thread.sleep(3000);
    }
    public void UserChooseSize() throws InterruptedException {
        driver.findElement(By.xpath("//span[@title='XL']")).click();
//        Thread.sleep(1000);
    }
    public void UserChooseQuantity() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='next-number-picker-handler-up-inner']")).click();
//       Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='next-number-picker-handler-up-inner']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='next-number-picker-handler-up-inner']")).click();
//        Thread.sleep(1000);
    }
    public void AddToCartButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='add-to-cart-buy-now-btn  pdp-button pdp-button_type_text pdp-button_theme_orange pdp-button_size_xl']")).click();
//        Thread.sleep(1000);
    }
    public void GoToCartAndDelete() throws InterruptedException {
        driver.findElement(By.xpath("//button[normalize-space()='GO TO CART']")).click();
//        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@class='cart-item-left']//input[@type='checkbox']")).click();
//       Thread.sleep(4000);
       driver.findElement(By.xpath("//span[text()='Delete']")).click();
//        Thread.sleep(3000);
    }
    public void RemoveButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
        Thread.sleep(1000);
    }




}

