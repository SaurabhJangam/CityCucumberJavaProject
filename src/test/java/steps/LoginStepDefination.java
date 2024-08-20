package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefination {


    @Given("User is already on login page")
    public void user_is_already_on_login_page() {

        System.out.println("User is already on login page");

    }

    @When("title of login is FREE CRM")
    public void title_of_login_is_FREE_CRM() {
        System.out.println("title of login is FREE CRM");

    }

    @Then("user enters {string} and {string}")
    public void user_enters_username_and_password(String username, String password) {
        System.out.println("user enters "+username+" and "+password+".");

    }

    @Then("user click on login button")
    public void user_click_on_login_button() {
        System.out.println("user click on login button");

    }

    @Then("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("user is on home page");

    }

}
