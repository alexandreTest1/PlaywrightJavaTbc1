package ge.tbc;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.Geolocation;
import com.microsoft.playwright.options.WaitUntilState;
import ge.tbc.data.Constants;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;


public class BaseTest {

    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;

    @BeforeClass
    public void openURL (){

        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setArgs(List.of("--start-maximized"))

        );


        context = browser.newContext(
                new Browser.NewContextOptions().setViewportSize(null)
                        .setPermissions(Arrays.asList("geolocation"))
                        .setGeolocation(new Geolocation(41.7151, 44.8271))
        );
        page = context.newPage();
        page.navigate(Constants.BASE_URL,
                new Page.NavigateOptions()

                        .setWaitUntil(WaitUntilState.LOAD));

    }





    protected Page getPage(){
        return page;
    }



}
