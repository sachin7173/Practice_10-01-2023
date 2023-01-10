package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy(xpath="//input[@id='login_field']")private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement PWD;
@FindBy(xpath="//input[@name='commit']")private WebElement Loginbtn;

public Login(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void Username12(String username) {
	UN.sendKeys(username);
}
public void password12(String password) {
	PWD.sendKeys(password);
}
public void LogintButton() {
	Loginbtn.click();
}
}
