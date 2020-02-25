package AppiumDemo;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class keyEvent extends TestBase {
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		
		//printing current activity
		System.out.println(driver.currentActivity());
	     System.out.println(driver.getContext());
	     
	     //views - Native , Hybrid, Webview
	     System.out.println(driver.getOrientation());
	     
	     System.out.println(driver.isDeviceLocked());
	     
	   //  driver.hideKeyboard();
	 	
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
		   //  driver.hideKeyboard();

	 	driver.hideKeyboard();

System.out.println("keyboard is hidden success");		

}

}