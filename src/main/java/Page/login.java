package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	
	By txt_username = By.id("email");
	By txt_password = By.id("pass");
	By loginButton = By.name("login");
	
	//constructor
	public login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterusername(String username) {
	driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clickloginbutton() {
		driver.findElement(loginButton).click();
	}

}
