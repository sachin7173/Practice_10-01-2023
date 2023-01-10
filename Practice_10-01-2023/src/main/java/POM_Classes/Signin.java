package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	@FindBy(xpath="//a[contains(text(),'Sign in')]")private WebElement signinbtn;
	

	public Signin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void SigninButton() {
		signinbtn.click();
	}
}
