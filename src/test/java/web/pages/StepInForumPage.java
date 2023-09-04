package web.pages;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import web.framework.CommonMethodsAndAssertions;
import web.framework.Logger;



public class StepInForumPage extends CommonMethodsAndAssertions {

	private By videoTab = By.xpath("//div[text()='Videos']");
	private By ElementToSelect = By.xpath("//a[@id='video-title-link' and @title='Am I a Social Monster?']");
	private By skipAdButton = By.className("ytp-ad-skip-button-container");
	private By settingsButton = By.xpath("//button[@title='Settings']");
	private By QualityButton =  By.xpath("//div[@class='ytp-menuitem-label' and text()='Quality']");
	
	public void verifyPageTitle(String title) {
		verifyPageTitleAssertion(title);
	}

	public void navigateToVideos() throws Exception {
		click(videoTab);
		//Thread.sleep(5000);
	}

	public void scrollToElement() throws Exception {
		scroll(ElementToSelect);
		
        
	}

	
	public void OpenVideo() throws Exception {
		// TODO Auto-generated method stub
		ActionsClick(ElementToSelect);
	}

	public void SkipAdAndChangeQuality() throws Exception {
		// TODO Auto-generated method stub
		clickIfOnlyPresent(skipAdButton);
		click(settingsButton);
		click(QualityButton);
		choose360p();
	}

	private void choose360p() {
		// TODO Auto-generated method stub
		Actions key = new Actions(driver);
		key.keyDown(Keys.ARROW_UP)
		.keyDown(Keys.ARROW_UP)
		.keyDown(Keys.ARROW_UP)
		.keyDown(Keys.ENTER).perform();
		
	}

	public void GetUpNextVideosAndWriteToJSON() {
		// TODO Auto-generated method stub
		
		JSONObject jsonObject = new JSONObject();
	      //Inserting key-value pairs into the json object
	      jsonObject.put("team", "siemens");
	      jsonObject.put("video", "stepin video");
	      
	      JSONArray upnextvideos = new JSONArray();
	      
	      List<WebElement> elements = driver.findElements(By.xpath("//div[@id='secondary-inner']//div[@id='items']//ytd-compact-video-renderer//span[@id='video-title']"));
	      for (int i=0; i<elements.size();i++){
	          String a = elements.get(i).getAttribute("title");
	          System.out.println(a);
	          upnextvideos.add(a); 
	        }

//	        listOfStates.add("Madhya Pradesh");  
//	        listOfStates.add("Maharastra");  
//	        listOfStates.add("Rajasthan");  

	        jsonObject.put("upcoming-videos", upnextvideos);
	      
	      try {
	          FileWriter file = new FileWriter(System.getProperty("user.dir")+"//OutputJSON");
	          file.write(jsonObject.toJSONString());
	          file.close();
	       } catch (IOException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	       }
	}
	
}
