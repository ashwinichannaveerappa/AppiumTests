package AppiumDemo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumBasicsLocators extends TestBase {

	public static void main(String[] args) throws MalformedURLException {

		// capabiltiies method returns driver object

		AndroidDriver<AndroidElement> driver = Capabilities("emulator");

		// click on preference
		// click on preferencesdependences
		// select wifi
		// enter wifi name
		// click on ok

		// id,xpath,classname, androidUiautomator

		// xpath syntax://tagname[@attribute='value']
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

		if (driver.findElementById("android:id/checkbox").isSelected() == false) {
			driver.findElementById("android:id/checkbox").click();
		} else {
			System.out.println("already wifi selected");
		}
		if (driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").isEnabled() == true) {
			driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		} else {
			System.out.println("element is not enabled");
		}

		driver.findElementByClassName("android.widget.EditText").sendKeys("asf");
		
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		driver.closeApp();
	}

}
