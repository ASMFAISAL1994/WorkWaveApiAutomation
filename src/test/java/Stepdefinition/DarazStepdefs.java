package Stepdefinition;

import Core.WebHelper;
import POM.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DarazStepdefs {
    public static WebDriver driver;

    WebElement element;

    @Given("base urls")
    public void baseUrls() {
        WebHelper helper = new WebHelper();
        driver=helper.browser();
        
    }

    @When("User will  click SignupLogin")
    public void userWillClickSignupLogin() throws InterruptedException {
//        element= new WebElement(driver);
        element= new WebElement(driver);
      element.SignupLogin();
    }


    @And("User will provide {string}, {string}, {string},{string}, {string},{string}, {string}, {string}")
    public void userWillProvideInfos(String PhoneNumber, String VerficationCodefromSMS, String Password, String Month, String Day, String Year, String Gender,String Fullname) throws InterruptedException {
     element.UsersInfo();
    }

    @Then("User will successfully SIGNUP")
    public void userWillSuccessfullySIGNUP() {
    }


    @Given("user in the daraz account page to create account")
    public void userInTheDarazAccountPageToCreateAccount() throws InterruptedException {
       element= new WebElement(driver);
        element.ClickGoogle();

    }

    @When("user will cilck to Goolge button for signup")
    public void userWillCilckToGoolgeButtonForSignup()  {

    }

    @And("user will provide {string} {string}and {string}")
    public void userWillProvideAnd(String Email, String Password, String Search) throws InterruptedException {
        element.UserProvideEmailPassword();
    }

    @Then("user will order  products")
    public void userWillOrderProducts() {
        System.out.println("faisal");
    }


    @Given("Customer in the Daraz website page")
    public void customerInTheDarazWebsitePage() throws InterruptedException {
        element= new WebElement(driver);
        element.UserWillClickSerach();

    }

    @When("customer will click his preferred T-shirt")
    public void customerWillClickHisPreferredTShirt() throws InterruptedException {
        element.UserChooseProduct();
    }

    @And("choose the T-shirt size")
    public void chooseTheTShirtSize() throws InterruptedException {
        element.UserChooseSize();
    }

    @And("customer will choose and click the size of the T-shirt")
    public void customerWillChooseAndClickTheSizeOfTheTShirt() throws InterruptedException {
        element.UserChooseQuantity();
    }

    @And("customer will click Add to Cart button")
    public void customerWillClickAddToCartButton() throws InterruptedException {
        element.AddToCartButton();
    }

    @And("customer will go to cart to click checkbox and  delete product")
    public void customerWillGoToCartToClickCheckboxAndDeleteProduct() throws InterruptedException {
        element.GoToCartAndDelete();
    }

    @Then("customer will click the Remove button to empty cart")
    public void customerWillClickTheRemoveButtonToEmptyCart() throws InterruptedException {
        element.RemoveButton();
    }
}
