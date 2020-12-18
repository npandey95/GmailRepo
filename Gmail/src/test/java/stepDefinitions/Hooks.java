package stepDefinitions;

import com.gmail.base.Base;
import com.gmail.utils.ConfigurationFileReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public static void startUp() {
		Base.reader = new ConfigurationFileReader();
		System.out.println(Base.reader);
		Base.initializeBrowser();
	}

	@After
	public static void tearDown() {
		Base.quitBrowser();

	}
}
