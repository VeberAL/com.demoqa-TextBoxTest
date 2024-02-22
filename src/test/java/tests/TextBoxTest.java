package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class TextBoxTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    String name = "Alexaner",
            mail = "aleo83@rambler.ru",
            currentAddress = "Baikonur, Koroleva st, 2",
            permanentAddress = "Penza, 65 Oktober st, 83";

    @Test
    void fillFormTest() {
        loginPage.openPage()
                .setUserName(name)
                .setUserEmail(mail)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .buttonClick();

        loginPage.checkData("#output #name", name)
                .checkData("#output #email", mail)
                .checkData("#output #currentAddress", currentAddress)
                .checkData("#output #permanentAddress", permanentAddress);
    }
}