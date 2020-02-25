package AppiumDemo;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class TestBase {
 

 //To launch the application
public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
 
		File app = new File("src", "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		if(device.contains("emulator")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ashemulator");
		}else if(device.contains("real")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		//cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		cap.setCapability("app", app.getAbsolutePath());

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
 
}
 
}