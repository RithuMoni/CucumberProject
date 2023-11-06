package makemytrip;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import facebook.BaseClass;

public class Hooks {
	BaseClass ba=new BaseClass();
	
	@Before
	public void browsersteps(Scenario s)
	{
		ba.browserLaunch();
		final byte[] before =((TakesScreenshot)ba.driver).getScreenshotAs(OutputType.BYTES);
		s.embed(before, "picture/png");
	}
	@After
	public void browserstep(Scenario s)
	{
		//ba.browserClose();
		final byte[] after =((TakesScreenshot)ba.driver).getScreenshotAs(OutputType.BYTES);
		s.embed(after, "picture/png");
	}

}
