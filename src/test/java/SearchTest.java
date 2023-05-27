import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SearchScreen;

public class SearchTest extends AppiumConfig {
    @Test
    public void searchCar()  {

        String location = new SearchScreen(driver).fillLocation().getLocation();
        Assert.assertEquals(location , "Tel Aviv");
    }
}
