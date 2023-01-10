package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath="//button[contains(text(),'Sign out')]")private WebElement Logoutbtn;

	public Logout(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void LogoutButton() {
		Logoutbtn.click();
	}
}
