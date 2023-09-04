package web.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_003_OpenChannel extends BaseTest {

	@Test
	public void OpenChannel() throws Exception {
		//HomePage.Launch();
		//HomePage.verifyPageTitle("YouTube");
		//HomePage.searchFor("step-inforum");
		HomePage.OpenChannel();
	}

}
