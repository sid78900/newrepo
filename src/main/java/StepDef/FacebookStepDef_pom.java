//package StepDef;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Page.login;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class FacebookStepDef_pom {
//
//	
//	WebDriver driver;
//	
//	@Given("when user open webpage")
//	public void when_user_open_webpage() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.manage().window().maximize();
//	}
//
//	@And("navigate to homepage")
//	public void navigate_to_homepage() {
//		driver.get("https://www.facebook.com/");
//	}
//	
//	
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_sid_and_hggg(String username, String password) {
//		
//		login loginn = new login(driver);
//		
//		loginn.enterusername(username);
//		loginn.enterpassword(password);
//	}
//
//	
//
//	@Then("user is on facebook loginpage")
//	public void user_is_on_facebook_loginpage() {
//		
//		login loginn = new login(driver);
//		loginn.clickloginbutton();
//		
//		//driver.findElement(By.name("login")).click();;
//	}
//
//	@Then("close window")
//	public void close_window() {
//	    driver.close();
//	}
//
//}
