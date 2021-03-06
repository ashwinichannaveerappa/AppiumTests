package AppiumDemo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomatorLocator extends TestBase {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		
		//syntaxt :  ("attribute("Value")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//validate clickable functionality
		//(driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)")
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	
	}
}
