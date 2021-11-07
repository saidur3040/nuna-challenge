package ui.test;

import org.junit.Test;
import ui.helper.TestHelper;
import ui.model.Values;
import ui.page.GoogleTranslatePage;

public class GoogleTranslateTest extends TestHelper {

    private GoogleTranslatePage googleTranslatePage = new GoogleTranslatePage(driver);
    private Values values = new Values();

//
//    @Before
//    public void setUpTest() {
//        driver.get("https://translate.google.com/");
//    }



    @Test
    public void detectLanguageTest(){
        googleTranslatePage.detectLanguage();
    }

    @Test
    public void translateToTest(){
        googleTranslatePage.translateTo();

    }
    @Test
    public void initialTextTest(){
        values.setText(values.getText());
        googleTranslatePage.initialText(values);
    }
    @Test
    public void translatedLanguageTest(){
        googleTranslatePage.translatedLanguage();
    }

}
