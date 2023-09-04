package web.framework;

import web.pages.*;
import web.utils.ConfigFileReader;

public class PageFactory {
	protected HomePage HomePage = new HomePage();
	protected StepInForumPage StepInForumPage = new StepInForumPage();
	protected static ConfigFileReader ConfigFileReader = new ConfigFileReader();
}
