package co.uk.zoopla.hooks;

import co.uk.zoopla.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Browsers
{
    public String chromeBrowser = "Chrome";
    @Before
    public void setUp(){
        launchBrowser(chromeBrowser);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
