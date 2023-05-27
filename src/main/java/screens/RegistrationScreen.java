package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.User;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegistrationScreen extends BaseScreen {
    public RegistrationScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(id = "com.telran.ilcarro:id/editRegName")
    MobileElement txtRegName;

    @FindBy(id = "com.telran.ilcarro:id/editRegLastName")
    MobileElement txtRegLastName;
    @FindBy(id = "com.telran.ilcarro:id/editRegEmail")
    MobileElement txtRegEmail;
    @FindBy(id = "com.telran.ilcarro:id/editRegPassword")
    MobileElement txtRegPassword;
    @FindBy(id = "com.telran.ilcarro:id/checkBoxAgree")
    MobileElement checkBox;
    @FindBy(id = "com.telran.ilcarro:id/regBtn")
    MobileElement buttonYalla;
    @FindBy(id = "com.telran.ilcarro:id/loginTitle")
    MobileElement labelLoginTitle;

    public RegistrationScreen isRegistrationScreenPresent() {
        Assert.assertTrue(labelLoginTitle.getText().equals("Registration"));
        return this;
    }

    public RegistrationScreen registration(User user) {
       type(txtRegName,user.getName()) ;
        type(txtRegLastName,user.getLastname()) ;
        type(txtRegEmail,user.getEmail()) ;
        type(txtRegPassword,user.getPassword()) ;
        return this;
    }
    public RegistrationScreen clickCheckBox(){
        checkBox.click();
        return this;
    }

    public SearchScreen clickRegistration(){
        buttonYalla.click();
        return new SearchScreen(driver);

    }
}
