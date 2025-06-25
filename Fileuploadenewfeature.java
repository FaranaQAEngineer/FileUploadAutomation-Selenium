package training;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadenewfeature {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);

		File f=new File("C:\\Users\\Farana\\Downloads\\mypic.png");
		//File is predefined class from java.io package 

		WebElement browse=d.findElement(By.xpath("//input[@id='file-upload']"));
		browse.sendKeys(f.getAbsolutePath());

		//getAbsolutePath is predefined method of File 
		//it is used to select the file

		WebElement upload=d.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
		Thread.sleep(2000);

	}

}
