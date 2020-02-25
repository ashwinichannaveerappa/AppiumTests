package AppiumDemo;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingDemo extends TestBase {
		
		public static void main(String[] args) throws MalformedURLException {
			AndroidDriver<AndroidElement> driver = Capabilities("emulator");
			driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

			//scrolldown using android api 
			//scroll till the view of the text
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");

}
}