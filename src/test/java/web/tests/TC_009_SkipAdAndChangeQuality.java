package web.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_009_SkipAdAndChangeQuality extends BaseTest {

	@Test
	public void SkipAdAndChangeQuality() throws Exception {
//		HomePage.Launch();
//		HomePage.verifyPageTitle("YouTube");
//		HomePage.searchFor("step-inforum");
//		HomePage.OpenChannel();
//		StepInForumPage.navigateToVideos();
//		StepInForumPage.scrollToElement();
//		StepInForumPage.OpenVideo();
		StepInForumPage.SkipAdAndChangeQuality();
	}

}
