package ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.helper.PageHelper;
import ui.model.Values;

public class GoogleTranslatePage extends PageHelper {

    private By detectLanguageField = By.xpath("//*[@id=\"i8\"]");
    private By selectLanguageFrom = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[1]/div/div[3]/div/div[3]/div[31]/div[2]");
    private By translateLanguageButton = By.xpath("//*[@id=\"i12\"]");
    private By translateLanguageTo = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[2]/div/div[3]/div/div[2]/div[90]/div[2]");
    private By textAreaField = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[1]/span/span/div/textarea");
    private By translatedLanguageField = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[1]");
    private By swapLanguageField = By.xpath("//*[@id=\"ow23\"]/div/span/button");
    private By clearTextInput = By.xpath("//*[@id=\"ow42\"]/div[1]/span/button/div[2]");
    private By clickOnKeyBoardField = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[1]/div[4]/div[3]/c-wiz/span/div/div/span/div/div/span/div/a[1]");


    public GoogleTranslatePage(WebDriver driver) {
        super(driver);
    }


    public void detectLanguage() {
        clickOnElement(detectLanguageField);
        clickOnElement(selectLanguageFrom);

    }

    public void translateTo() {
        clickOnElement(translateLanguageButton);
        clickOnElement(translateLanguageTo);
    }

    public void initialText(Values value) {

        setField(textAreaField, value.getText());
    }

    public void translatedLanguage() {

        getText(translatedLanguageField);
    }

    public void swapLanguage() {
        clickOnElement(swapLanguageField);

    }

    public void clearTheInput() {
        clickOnElement(clearTextInput);

    }

    public void screenKeyBoard() {
        clickOnElement(clickOnKeyBoardField);
    }


}
