import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumRunner {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);

		// Menggunakan cssSelector
		
		// Masuk ke link github
		driver.get("https://github.com/");
		// Untuk tekan searching dan buka form search
		WebElement searchButton = driver.findElement(By.cssSelector("button[aria-label='Search or jump to…']"));
		searchButton.click();
		WebElement searchInput = driver.findElement(By.cssSelector(".FormControl-input.QueryBuilder-Input.FormControl-medium"));
		// input teks "Selenium"
		searchInput.sendKeys("Selenium");
		// untuk tekan enter
		searchInput.sendKeys(Keys.ENTER);
		
		// tunggu 5 detik
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		// Contoh Lain
		// pindah ke contohnya e-learning usk
		driver.get("https://elearning.usk.ac.id/");
		
		// input username / npm
		WebElement username = driver.findElement(By.cssSelector("[placeholder='Username']"));
		username.sendKeys("2208107010013");
		// input password
		WebElement password = driver.findElement(By.cssSelector("[placeholder='Password']"));
		password.sendKeys("81935746");
		// tekan submit
		WebElement submit = driver.findElement(By.cssSelector("[id='submit']"));
		submit.click();
		
		// tunggu 5 detik
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		// tekan menu nama
		WebElement userMenu = driver.findElement(By.cssSelector("[id='user-menu-toggle']"));
		userMenu.click();
		
		
		// Menggunakan XPath
	
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"carousel-item-main\"]/a[1]"));
		profile.click();
		
		// tunggu 5 detik
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		// tekan menu nama
		WebElement userMenu3 = driver.findElement(By.cssSelector("[id='user-menu-toggle']"));
		userMenu3.click();
	
		WebElement grade = driver.findElement(By.xpath("//*[@id=\"carousel-item-main\"]/a[2]"));
		grade.click();
		
		// tunggu 5 detik
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		// tekan menu nama
		WebElement userMenu2 = driver.findElement(By.cssSelector("[id='user-menu-toggle']"));
		userMenu2.click();
		
		// logout dari e-learning
		WebElement logoutLink = driver.findElement(By.xpath("//*[@id='carousel-item-main']/a[8]"));
		logoutLink.click();
		
		// tunggu 5 detik
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		WebElement manajemen = driver.findElement(By.xpath("//*[@id=\"frontpage-available-course-list\"]/div/div[1]/div[2]/div[1]/h3/a"));
		manajemen.click();
		
		WebElement guest = driver.findElement(By.xpath("//*[@id=\"loginguestbtn\"]"));
		guest.click();
		
		// tunggu 5 detik
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		// kembali ke home
		driver.get("https://elearning.usk.ac.id/");
	}

}