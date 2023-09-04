package web.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_006_007_ScrollToElement extends BaseTest {

	@Test
	public void ScrollToElement() throws Exception {
//		HomePage.Launch();
//		HomePage.verifyPageTitle("YouTube");
//		HomePage.searchFor("step-inforum");
//		HomePage.OpenChannel();
//		StepInForumPage.navigateToVideos();
		StepInForumPage.scrollToElement();
	}

}
