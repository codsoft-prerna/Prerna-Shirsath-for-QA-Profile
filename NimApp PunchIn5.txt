package loginPage;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PunchIn {
	
	WebDriver driver;
	
	public PunchIn(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Punch In']")
	WebElement punchIn;
	
	public void clickOnPunchIn() throws InterruptedException {
		punchIn.click();
		Thread.sleep(1000);
	}

}
