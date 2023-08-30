package pagefactoryPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webelements111{
	WebDriver driver;
	
	@FindBy(linkText = "https://wpportfolio.net/pricing/")
WebElement BuyNow;
	
	@FindBy(className = "elementor-button-text elementor-inline-editing")
	WebElement wp;
	
	//constructor
 public Webelements111(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		

	public void clickkk() {
		BuyNow.click();
		
		
	}
	
	
	
	

}
