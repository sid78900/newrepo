package StepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	System.out.println("1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();

	
		
	 
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("2");
		driver.get("https://www.facebook.com/signup");
	
	}

	@And("hits enter button")
	public void hits_enter_button() {

		System.out.println("3");
		driver.findElement(By.className("_58mt")).click();
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
		
	System.out.println("4");
	
	}


}
