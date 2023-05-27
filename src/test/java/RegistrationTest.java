import config.AppiumConfig;
import models.User;
import org.testng.annotations.Test;
import screens.SearchScreen;

import java.util.Random;

public class RegistrationTest extends AppiumConfig {
    int i = new Random().nextInt(1000) + 1000;

    @Test
    public void regPositive(){
        new SearchScreen(driver)
                .openMoreOptions()
                .openRegForm()
                .registration(User.builder()
                        .name("noa"+i)
                        .lastname("noa")
                        .email("noa"+i+"@gmail.com")
                        .password("Noa123456$")
                        .build())
                .clickCheckBox()
                .clickRegistration();
    }
}
