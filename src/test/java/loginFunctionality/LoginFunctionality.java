package loginFunctionality;

//public class LoginFunctionality {
	//package loginFunctionality;

	import java.time.Duration;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;
	import loginPage.AddNewCustomer;
	import loginPage.LoginPage;
	import loginPage.PunchIn;

	public class LoginFunctionality {

		@Test	
		
		public void loginFuctionalityTest() throws InterruptedException {
				
			WebDriver driver = new ChromeDriver();	
			LoginPage loginPage = new LoginPage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			loginPage.goTo();
			loginPage.enterUserName("shirsathprerna725@gmail.com");
			loginPage.enterPassword("Abcd1234@");
			loginPage.enterCaptcha();
			loginPage.clickOnSignIn();
			
			Thread.sleep(5000);
			PunchIn PunchIn =new PunchIn(driver);
//			punchIn.clickOnPunchIn();
			
			AddNewCustomer addNewCustomer = new AddNewCustomer(driver);
			
//			Click on my customer
			addNewCustomer.clickOnMyCustomer();
			addNewCustomer.addNewCustomer();
			addNewCustomer.fillPrimaryContact("Prerna", "BF234", "Prerna", "7096597479", "shirsathprerna725@gmail.com", "SDET");
			addNewCustomer.customerAddress("Amravati", "444606");
			addNewCustomer.saveCustomer();
			
		}
	}


