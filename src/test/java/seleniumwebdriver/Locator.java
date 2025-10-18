package seleniumwebdriver;


import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println("You're Doing something Great ");
	 System.out.println("Testing is in Progress ......");
		
		WebDriver driver = new ChromeDriver();
		
		//go to url
		driver.get("https://www.naukri.com/");
		//maximize window
		driver.manage().window().maximize();
		
		//Implicit wait 
		//it will implement when wait is required in all script
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit Wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		
		// Locator 
		//by id
		WebElement signin = driver.findElement(By.id("login_Layer"));
		signin.click();
		
		//by xpath
		WebElement username = driver.findElement(By.cssSelector("input[placeholder=\"Enter your active Email ID / Username\"]"));
		username.sendKeys("kunalkumar20898@gmail.com");
		
		//By css selector
		WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Enter your password\"]"));
		password.sendKeys("Password");
		
		//By tagname
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
		//by link text
		WebElement viewProfile = driver.findElement(By.linkText("View profile"));
		//explict Wait
     	mywait.until(ExpectedConditions.elementToBeClickable(viewProfile));
		viewProfile.click();
		
		
	
		
		//
//		WebElement editOnTheme = driver.findElement(By.xpath("//em[text() =\"editOneTheme\"]"));
//		editOnTheme.click();
		
	
//		//by partial Link Text
//		WebElement noticePeriod = driver.findElement(By.xpath("//span[@data-value=\"1 Month\"]"));
//		WebElement noticePeriod15days =  driver.findElement(By.xpath("//span[@data-value=\"15 Days or less\"]"));

//		if (noticePeriod.isDisplayed()) {
//
//		if(!noticePeriod.isSelected()) {
//			
//			noticePeriod.click();
//		}
//		else if((noticePeriod.isSelected())) {
//			noticePeriod15days.click();
//			
//		}
//		else {
//			System.out.println("Already Selected   ");
//		}
//
//		}
//		else {
//			System.out.println("element not visible");
//		}
		
//		//by id
//		WebElement save = driver.findElement(By.xpath("(//a[text()='Cancel'])[3]"));
//				
//		save.click();
		
		//By xpath
		WebElement jobs= driver.findElement(By.xpath("//div[text()='Jobs']"));
		jobs.click();
		
//		List<WebElement> checkboxes = driver.findElements(By.className("dspIB naukicon naukicon-ot-checkbox"));
//
//		for (WebElement checkbox : checkboxes) {
//		    if (!checkbox.isSelected()) {
//		        checkbox.click();
//		    }
//		}
//		
		
        // Locate all job checkboxes inside jobTuple cards
        List<WebElement> checkboxes = driver.findElements(
            By.xpath("//article[contains(@class,'jobTuple')]//div//i[@class=\"dspIB naukicon naukicon-ot-checkbox\"]")
        );

        int selectedCount = 0;

        for (WebElement checkbox : checkboxes) {
            if (selectedCount >= 5) {
                break; // stop after selecting 5
            }

            // Only click if not already selected
            if (!checkbox.isSelected()) {
                checkbox.click();
                selectedCount++;
            }
        }

     // Click on Apply Job button (adjust locator as per actual DOM)
        WebElement applyButton = driver.findElement(
            By.xpath("//button[contains(text(),'Apply')]")
        );
        applyButton.click();

      WebElement question = driver.findElement(By.xpath("//span[text()='What is your current CTC per annum in lakhs? (Mention Only Number) (For e.g. 10)']"));
//		mywait.until(ExpectedConditions.visibilityOfAllElements(question));
		if(question.isDisplayed()) {
			WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
			answer.sendKeys("5");
			WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
			save.click();
		}
		

	      WebElement question1 = driver.findElement(By.xpath("//span[text()='What is your notice period?']"));
//			mywait.until(ExpectedConditions.visibilityOfAllElements(question));
			if(question1.isDisplayed()) {
				WebElement answer = driver.findElement(By.xpath("//label[@for=\"15 Days or less\"]"));
				answer.click();
				WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
				save.click();
			}
			  WebElement question2 = driver.findElement(By.xpath("//span[text()='If you have to rate yourself based on your experience on Manual Testing ? (1-10)']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question2.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
					answer.sendKeys("9");
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				
				WebElement question3 = driver.findElement(By.xpath("//span[text()='If you have to rate yourself based on your experience on Automation Testing ? (1-10)']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question3.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
					answer.sendKeys("9");
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				
				WebElement question4 = driver.findElement(By.xpath("//span[text()='Please mention last working day if serving notice or not working currently']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question4.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
					answer.sendKeys("30 Oct 2025");
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				WebElement question5 = driver.findElement(By.xpath("//span[text()='How many years of experience do you have in Html/Css?']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question5.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
					answer.sendKeys("2.5");
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				WebElement question6 = driver.findElement(By.xpath("//span[text()='Please select the city you are currently residing or willing to relocate to']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question6.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div//label[@for=\"Bengaluru, Karnataka\"]"));
					answer.click();
					WebElement answer1 =driver.findElement(By.xpath("//div//label[//label[@for=\"Noida, Uttar Pradesh\"]"));
					answer1.click();
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				
				WebElement question7 = driver.findElement(By.xpath("//span[text()='What is your expected CTC per annum in lakhs? (Mention Only Number) (For e.g. 10)']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question7.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
					answer.sendKeys("10");
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				WebElement question8 = driver.findElement(By.xpath("//span[text()='If you have to rate yourself based on your experience on API Testing ? (1-10)']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question8.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
					answer.sendKeys("9");
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				
				WebElement question9 = driver.findElement(By.xpath("//span[text()='If you have to rate yourself based on your experience on Database Testing ? (1-10)']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question9.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
					answer.sendKeys("9");
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				
				WebElement question10 = driver.findElement(By.xpath("//span[text()='Are you currently residing in Delhi- NCR and open to work from office ?']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question10.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//label[@for=\"Yes\"]"));
					answer.click();
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				
				WebElement question11 = driver.findElement(By.xpath("//span[text()='How many years of experience do you have in Java Selenium?']"));
//				mywait.until(ExpectedConditions.visibilityOfAllElements(question));
				if(question11.isDisplayed()) {
					WebElement answer = driver.findElement(By.xpath("//div[@data-placeholder=\"Type message here...\"]"));
					answer.sendKeys("3");
					WebElement save = driver.findElement(By.xpath("//div[text() ='Save']"));
					save.click();
				}
				
		//driver.close();
	}
	
}
