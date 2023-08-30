//package HookStepDef;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class HooksStepDef {
//	WebDriver driver;
//	
//	@Before(order=1) //HOOKs
//	public void browserSetup() {
//		System.out.println("in");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\sid\\chromedriver_win32\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.manage().window().maximize();
//	}
//	
//	@Before(order=2)  // for condition hook use tag name @before("tagname"), to make it order @before(value="@tagnme",order=1)
//public void brow2() {
//		System.out.println("checking order");
//	}
//	
//	@After
//	public void endProgram() {
//		System.out.println("end");
//		driver.close();
//		driver.quit();
//	}
//	
//	@BeforeStep
//	public void before() {
//		System.out.println("in step");
//	}
//	
//    @AfterStep
//public void after() {
//    	System.out.println("ater step");
//    }
//	@Given("user on login page")
//	public void user_on_login_page() {
//	    System.out.println("ddd");
//	}
//
//	@And("user navigate")
//	public void user_navigate() {
//	    System.out.println("f");
//	}
//
//	@When("Enter values")
//	public void enter_values() {
//	   System.out.println("xxd");
//	}
//
//	@Then("login page")
//	public void login_page() {
//	  System.out.println("dssd");
//	}
//
//	
//
//
//
//
//}
