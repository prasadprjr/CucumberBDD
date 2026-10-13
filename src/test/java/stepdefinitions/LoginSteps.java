package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
	
private LoginPage loginPage;

@Given("User navigateto OrangeHRM Portal")
public void orangeHrm()
{
	loginPage = new LoginPage(DriverFactory.getDriver());
	
	DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	
}
@When ("User enter username")
public void enterUserName()
{
	loginPage.enterUserName("Admin");
}
@When ("User enter password")
public void enterPassword()  
{
	loginPage.enterPassWord("admin123");
 
}
@When ("User click Login button")
public void clickLoginButton()
{
	loginPage.clickButton();
 
}
@Then("User land to Dashboard Screen for Confirmation")
public void landDashBoardScreen()
{
	loginPage.verifyUrl();
}

}

