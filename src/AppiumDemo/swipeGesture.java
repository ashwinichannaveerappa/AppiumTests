package AppiumDemo;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
 

public class swipeGesture extends TestBase {
	
public static void main(String[] args) throws MalformedURLException {
	AndroidDriver <AndroidElement> driver = Capabilities();
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
	driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	driver.findElementByXPath("//*[@content-desc='9']").click();
	
	//touchactions instance -


	TouchAction touchaction = new TouchAction(driver);
	WebElement	from = 	driver.findElementByXPath("//*[@content-desc='15']");
	WebElement	To = 	driver.findElementByXPath("//*[@content-desc='45']");
	//swipe -
	//first long press 1s econd  on element  and  then moved to element and leave it
	touchaction.longPress(longPressOptions().withElement(element(from)).withDuration(Duration.ofSeconds(2))).moveTo(element(To)).release().perform();
	
}
}
