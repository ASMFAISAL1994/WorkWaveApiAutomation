package Stepdefinition;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppLoginStepdefs {
    DesiredCapabilities dc = new DesiredCapabilities();

    static AndroidDriver driver = null;
    @Given("User in the login page")
    public void userInTheLoginPage() throws MalformedURLException, InterruptedException {

        dc.setCapability(MobileCapabilityType.UDID, "bea80a44");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO");
        dc.setCapability("platformVersion", "11.0");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
        Thread.sleep(6000);
        driver  = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);


    }

    @And("User fill {string} and {string}")
    public void userFillAnd(String userName, String password) throws InterruptedException {
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='Username']")).sendKeys(userName);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='Password']")).sendKeys(password);

    }

    @And("press {string}")
    public void press(String login) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Login']")).click();

//        driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@text='Phone']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys("01623928456");



    }

    @Then("user will be logged in")
    public void userWillBeLoggedIn() {
        System.out.println("faisal");
    }

    @Given("User in the Payment page")
    public void userInThePaymentPage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='Make Payment']")).click();



    }

    @And("User will fill {string} and {string}")
    public void userWillFillAnd(String PhoneNumber, String Name) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Phone']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys(PhoneNumber);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Name']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Name']")).sendKeys(Name);
        Thread.sleep(2000);
    }

    @And("provide {string}")
    public void provide(String Amount ) throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Amount']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Amount']")).sendKeys(Amount);
        Thread.sleep(2000);

    }

    @And("choose {string}")
    public void choose(String Country) throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Country']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Country']")).sendKeys(Country);
        Thread.sleep(2000);

    }

    @Then("user will be click Send Payment button")
    public void userWillBeClickSendPaymentButton() throws InterruptedException {

        driver.findElement(By.xpath("//*[@text='Send Payment']")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    @Given("user in the Mortgage page")
    public void userInTheMortgagePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Mortgage Request']")).click();
        Thread.sleep(2000);

    }

    @And("user will provide {string} {string} {string}")
    public void userWillProvideFirstNameLastName(String FirstName,String LastName,String Age) throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='First Name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='First Name']")).sendKeys(FirstName);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Last Name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Last Name']")).sendKeys(LastName);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Age']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Age']")).sendKeys(Age);
        Thread.sleep(2000);
    }

    @And("user will provide {string} {string} AND {string}")
    public void userWillProvideAND(String Address1, String Address2, String Country) throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Address 1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Address 1']")).sendKeys(Address1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Address 2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Address 2']")).sendKeys(Address2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Select']")).click();
        Thread.sleep(2000);




    }

    @Then("user will click Next button")
    public void userWillClickNextButton() throws InterruptedException {

//        driver.findElement(By.xpath("//*[@text='Select']")).click();
//        Thread.sleep(3000);


        driver.findElement(By.xpath("//*[@text='India']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Personal']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='5']")).click();
        Thread.sleep(2000);
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(427, 1124)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(585))).moveTo(PointOption.point(427, 179)).release().perform();
        driver.findElement(By.xpath("//*[@text='Private Job']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='25,00,000']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Save']")).click();
        Thread.sleep(2000);

    }

    @Given("User in the Expense Report page")
    public void userInTheExpenseReportPage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Expense Report']")).click();
        Thread.sleep(2000);
    }

    @And("User will click Add button")
    public void userWillClickAddButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Add']")).click();
        Thread.sleep(2000);
    }


    @And("User will click Back button to go home page")
    public void userWillClickBackButtonToGoHomePage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Back']")).click();
        Thread.sleep(2000);
    }

    @Then("User will be successfully Logout")
    public void userWillBeSuccessfullyLogout() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Logout']")).click();
        Thread.sleep(2000);
    }
}
