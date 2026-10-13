package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
private WebDriver driver;
private WebDriverWait wait;

private By username=By.xpath("//input[@name='username']");
private By password=By.xpath("//input[@name='password']");
private By login=By.xpath("//button[@type='submit']");

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	this.wait=new WebDriverWait(driver,Duration.ofSeconds(20));
}

public void enterUserName(String uservalue)
{
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(username));
	element.clear();
	element.sendKeys(uservalue);
	
}
public void enterPassWord(String pwdvalue)
{
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(password));
	element.clear();
	element.sendKeys(pwdvalue);	
	
}
public void clickButton()
{
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(login));
	element.click();
	
} 
public void verifyUrl()
{
	System.out.println("Navigated to Dashbord");
}


}
