package samplepack;

import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumJava {

	static int a=90;
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chenn\\IdeaProjects\\CucumberDemoframework\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	
		driver.manage().window().maximize();
		
		
		
	}

}
