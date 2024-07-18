package loginPage;


	

	import java.time.Duration;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {

		WebDriver driver;
		
			
		public LoginPage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	 

		@FindBy(id = "mat-input-0")
		WebElement userName;
		
		@FindBy(id = "mat-input-1")
		WebElement userPassword;
		
		@FindBy(xpath = "//input[@ng-reflect-name='captchaValue']")
		WebElement captcha;
		
		@FindBy(id = "kt_login_signin_submit")
		WebElement signInBtn;
		
		public void goTo() {
			
			driver.manage().window().maximize();
			driver.get("https://testffc.nimapinfotech.com/auth/login");
			
		}
		
		public void enterUserName(String uName) {
			
			userName.sendKeys(uName);
		}
		
		public void enterPassword(String password) {
			
			userPassword.sendKeys(password);
		}
		
		public void enterCaptcha() throws InterruptedException {
			
			captcha.click();
			Thread.sleep(10000);
		}
		
		public void clickOnSignIn() {
			
			signInBtn.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	}



