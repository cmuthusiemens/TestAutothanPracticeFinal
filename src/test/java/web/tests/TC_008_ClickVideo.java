package web.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_008_ClickVideo extends BaseTest {

	@Test
	public void ClickVideo() throws Exception {
//		HomePage.Launch();
//		HomePage.verifyPageTitle("YouTube");
//		HomePage.searchFor("step-inforum");
//		HomePage.OpenChannel();
//		StepInForumPage.navigateToVideos();
//		StepInForumPage.scrollToElement();
		StepInForumPage.OpenVideo();
	}

}
