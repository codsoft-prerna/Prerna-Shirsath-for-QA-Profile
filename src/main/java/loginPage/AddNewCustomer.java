package loginPage;



	import java.time.Duration;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AddNewCustomer extends Utilities {

		WebDriver driver;
		
		public AddNewCustomer(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		

		@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")
		WebElement myCustomer;
		
		@FindBy(xpath = "//*[@id=\"kt_content\"]/div/ng-component/kt-customers-list/mat-drawer-container/mat-drawer-content/kt-portlet/div/kt-portlet-header/div[4]/button[1]/span")
		WebElement addNewCustomer;
		
		@FindBy(xpath = "//input[@ng-reflect-name='LeadName']")
		WebElement customerName;
		
		@FindBy(xpath = "//input[@ng-reflect-name='RefNo']")
		WebElement refNo;
		
		@FindBy(xpath = "//input[@ng-reflect-name='PersonName']")
		WebElement contactName;
		
		@FindBy(xpath = "//input[@ng-reflect-name='MobileNo']")
		WebElement mobileNumber;
		
		@FindBy(xpath = "//input[@ng-reflect-name='Email']")
		WebElement emailId;
		
		@FindBy(xpath = "//input[@ng-reflect-name='PersonDesignation']")
		WebElement designation;
		
		@FindBy(xpath = "//input[@ng-reflect-name='Address']")
		WebElement address;
		
		@FindBy(xpath = "//div[@class='mat-form-field-infix']//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored pac-target-input']")
		WebElement location;

		@FindBy(xpath = "//span[text()='Done']") 
		WebElement doneBtn;
		
		@FindBy(xpath = "(//div[@class='mat-select-arrow'])[15]")
		WebElement countryField;
		
		@FindBy(xpath = "//span[text()=' India ']")
		WebElement country;
		
		@FindBy(xpath = "(//div[@class='mat-select-arrow'])[16]")
		WebElement stateField;
		
		@FindBy(xpath = "//span[text()=' Maharashtra ']")
		WebElement state;
		
		@FindBy(xpath = "(//div[@class='mat-select-arrow'])[17]")
		WebElement cityField;
		
		@FindBy(xpath = "//span[text()=' Amravati ']")
		WebElement city;
		
		@FindBy(xpath = "(//div[@class='mat-select-arrow'])[18]")
		WebElement localityField;
		
		@FindBy(xpath = "//span[text()=' Amravati ']")
		WebElement locality;
		
		@FindBy(xpath = "//input[@ng-reflect-name='PinCode']")
		WebElement pincode;
		
		@FindBy(xpath = "//span[text()=' Save ']")
		WebElement saveBtn;

		public void clickOnMyCustomer() {
			myCustomer.click();
		}
		
		public void addNewCustomer() throws InterruptedException {
			addNewCustomer.click();
			Thread.sleep(3000);
		}
		
		public void fillPrimaryContact(String custName, String reference, String contName, String mobNo, String email, String custDesg) {
			customerName.sendKeys(custName);
			refNo.sendKeys(reference);
			contactName.sendKeys(contName);
			mobileNumber.sendKeys(mobNo);
			emailId.sendKeys(email);
			designation.sendKeys(custDesg);
		}
		
		public void customerAddress(String add, String pin) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			address.click();
			location.clear();
			location.sendKeys(add);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			doneBtn.click();
			waitForElementToBeClickable(countryField);
			Thread.sleep(1000);
			countryField.click();
			country.click();
			Thread.sleep(1000);
//			waitForElementToBeClickable(stateField);
			stateField.click();
			state.click();
			Thread.sleep(1000);
//			waitForElementToBeClickable(cityField);
			cityField.click();
			city.click();
			Thread.sleep(1000);
//			waitForElementToBeClickable(localityField);
			localityField.click();
			locality.click();
			Thread.sleep(1000);
//			waitForElementToBeClickable(pincode);
			pincode.sendKeys(pin);
		}
		
		public void saveCustomer() {
			saveBtn.click();
		}
		
		
	}























