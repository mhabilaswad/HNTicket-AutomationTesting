import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiAutomatorTest extends base{
	
	public static void main(String[] args) throws Exception {
		AndroidDriver<AndroidElement> driver =capablities();
		
		// 4. uiAutomator "attribut(\"value\")"
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	}
}
