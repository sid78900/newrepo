package pagefactoryPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPageFactory {
	WebDriver driver;
    
	@FindBy(id= "email")
	WebElement txt_username;
	
	//cConstructor
	public DemoLoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//or classname u can menation
	}
	
	public void enterMaterial() {
		txt_username.sendKeys("toys");
	}
	
	
}
