package mobile.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mobile.framework.BaseTest;
@Listeners (mobile.framework.TestStatusListener.class)
public class TC_001_OpenWebsite extends BaseTest {

	@Test
	public void OpenWebsite() throws Exception {
		HomePage.Launch();
		HomePage.verifyPageTitle("Home - YouTube");

	}

}
