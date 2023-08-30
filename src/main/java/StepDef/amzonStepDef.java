package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactoryPackage.DemoLoginPageFactory;

public class amzonStepDef {
	WebDriver driver;
	
	@Given("user is on webpage")
	public void user_is_on_webpage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}

	@When("navigate to amzon webpage")
	public void navigate_to_amzon_webpage() {
		driver.get("https://www.facebook.com/");
	}

	@Then("search material name")
	public void search_material_name() {
		DemoLoginPageFactory demoPF = new DemoLoginPageFactory(driver);
		demoPF.enterMaterial();
	  System.out.println("ok");
	}



}
