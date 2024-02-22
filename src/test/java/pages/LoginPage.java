package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private final SelenideElement userNameInput = $("#userName"),
            userMailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            clickButton = $("#submit");

    public LoginPage openPage() {
        open("/text-box");
        $("#app").shouldHave(text("Text Box"));
        return this;
    }

    public LoginPage setUserName(String name) {
        userNameInput.setValue(name);
        return this;
    }

    public LoginPage setUserEmail(String email) {
        userMailInput.setValue(email);
        return this;
    }

    public LoginPage setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);
        return this;
    }

    public LoginPage setPermanentAddress(String permanentAddress) {
        permanentAddressInput.setValue(permanentAddress);
        return this;
    }

    public void buttonClick() {
        clickButton.click();
    }

    public LoginPage checkData(String data, String value) {
        $(data).shouldHave(text(value));
        return this;
    }
}