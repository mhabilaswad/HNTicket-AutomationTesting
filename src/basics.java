import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{

	public static void main(String[] args) throws Exception{
		
		AndroidDriver<AndroidElement> driver =capablities();
		
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.hntiket:id/btnExplore\"]").click();
		Thread.sleep(5000);
		
		// Test Case 1: Register
		Thread.sleep(3000);
		driver.findElementsById("com.example.hntiket:id/tvRegister").get(0).click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.hntiket:id/etFullName\"]").sendKeys("Muhammad Habil Aswad");;
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.hntiket:id/etPhone\"]").sendKeys("082165463735");
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.hntiket:id/etPassword\"]").sendKeys("habilaswad30");
		Thread.sleep(3000);
		driver.findElementsById("com.example.hntiket:id/btnRegister").get(0).click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.hntiket:id/btnGoToLogin\"]").click();
		
		Thread.sleep(5000);
		
		// Test Case 2: Login with wrong password
		driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("08123456789");
		Thread.sleep(3000);
		driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("habilaswad");
		Thread.sleep(3000);
		driver.findElementsByClassName("android.widget.Button").get(0).click();
		
		Thread.sleep(5000);
		
		// Test Case 3: Login with correct password
		driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("082165463735");
		Thread.sleep(3000);
		driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("habilaswad30");
		Thread.sleep(3000);
		driver.findElementsByClassName("android.widget.Button").get(0).click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.hntiket:id/btnContinue\"]").click();
		
		Thread.sleep(5000);
		
		// Test Case 4: Scroll homepage
		Dimension size = driver.manage().window().getSize();
		int screenWidth = size.width;
		int screenHeight = size.height;
		
		// Scroll ke atas
		HashMap<String, Object> swipeUp = new HashMap<>();
		swipeUp.put("left", screenWidth / 2);
		swipeUp.put("top", screenHeight / 4);
		swipeUp.put("width", 0);
		swipeUp.put("height", screenHeight / 2);
		swipeUp.put("direction", "up");
		swipeUp.put("percent", 0.3);

		driver.executeScript("mobile: swipeGesture", swipeUp);
		Thread.sleep(3000);
		driver.executeScript("mobile: swipeGesture", swipeUp);
		
		Thread.sleep(5000);
		
		// Scroll ke bawah
		HashMap<String, Object> swipeDown = new HashMap<>();
		swipeDown.put("left", screenWidth / 2);      // posisi horizontal tengah layar
		swipeDown.put("top", screenHeight / 4);      // mulai dari 1/4 atas
		swipeDown.put("width", 0);                   // tidak perlu area lebar, karena vertikal
		swipeDown.put("height", screenHeight / 2);   // area swipe setengah layar
		swipeDown.put("direction", "down");
		swipeDown.put("percent", 0.3);

		driver.executeScript("mobile: swipeGesture", swipeDown);
		Thread.sleep(3000);
		driver.executeScript("mobile: swipeGesture", swipeDown);

		Thread.sleep(5000);
		
		// Test Case 5: Movie
		driver.findElementByXPath("//android.widget.ImageView[@resource-id=\"com.example.hntiket:id/imageMovie1\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageView[@resource-id=\"com.example.hntiket:id/buttonBack\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageView[@resource-id=\"com.example.hntiket:id/imageMovie2\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageView[@resource-id=\"com.example.hntiket:id/buttonBack\"]").click();

		Thread.sleep(5000);		

		// Test Case 6: Event
		driver.findElementById("com.example.hntiket:id/imageEvent1").click();
		Thread.sleep(3000);
		driver.findElementById("com.example.hntiket:id/buttonBack").click();
		Thread.sleep(3000);
		driver.findElementById("com.example.hntiket:id/imageEvent2").click();
		
		Thread.sleep(5000);
		
		// Test Case 7: Booking Event
		driver.findElementByClassName("android.widget.Button").click();
		Thread.sleep(3000);
		driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("Muhammad Habil Aswad");
		Thread.sleep(3000);
		driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("082165463735");
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"BCA\"]").click();
		Thread.sleep(3000);
		driver.executeScript("mobile: swipeGesture", swipeUp);
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"BNI\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.hntiket:id/btnBuyTicket\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]").click();
		
		Thread.sleep(5000);
		
		// Test Case 8: Profile
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Profile\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//android.widget.LinearLayout[@resource-id=\"android:id/content\"])[1]").click();
		
		Thread.sleep(5000);
		
		// Test Case 9: Cancel Booking
		driver.findElementsByClassName("android.widget.Button").get(0).click();
		Thread.sleep(3000);
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		Thread.sleep(5000);
		
		// Test Case 10: Logout
		driver.findElementByXPath("//android.widget.ImageView[@resource-id=\"com.example.hntiket:id/buttonBack\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Profile\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//android.widget.LinearLayout[@resource-id=\"android:id/content\"])[2]").click();
	}
}
