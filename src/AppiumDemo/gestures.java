package AppiumDemo;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
 

public class gestures extends TestBase{

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		//Tap -- first gesture
		TouchAction touchaction = new TouchAction(driver);
		WebElement  expanadalelist= driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		touchaction.tap(tapOptions().withElement(element(expanadalelist))).perform();
		
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		//longpresss and validate submenu is dispalyed
		
		WebElement peopleNames =driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touchaction.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(Duration.ofSeconds(2))).release().perform();
		Assert.assertTrue(driver.findElementById("android:id/title").isDisplayed());
		
		System.out.println("pop up displayed");
		
		
	}
}
