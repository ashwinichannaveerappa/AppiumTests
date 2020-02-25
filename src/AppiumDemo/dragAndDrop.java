package AppiumDemo;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class dragAndDrop extends TestBase {
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		//drag and drop
		//longpress on element and move to the destination element and leave it
	
		TouchAction touchaction= new TouchAction(driver);
						
	WebElement From =driver.findElementById("io.appium.android.apis:id/drag_dot_1");
	WebElement To= driver.findElementById("io.appium.android.apis:id/drag_dot_3");
	
	//touchaction.longPress(longPressOptions().withElement(element(From))).moveTo(element(To)).release().perform();
	//when we dont have more actions like presiong and watiing for few seconds we can use the below line
	touchaction.longPress(element(From)).moveTo(element(To)).release().perform();

	
	}

}
