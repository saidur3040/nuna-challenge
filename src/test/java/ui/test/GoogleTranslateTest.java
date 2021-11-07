package ui.test;

import org.junit.Test;
import ui.helper.TestHelper;
import ui.page.GoogleTranslatePage;

public class GoogleTranslateTest extends TestHelper {

    private GoogleTranslatePage googleTranslatePage = new GoogleTranslatePage(driver);

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
    public void translateLanguageTest(){
        googleTranslatePage.translateLanguage();

    }
    @Test
    public void textArea(){
        googleTranslatePage.textArea();
    }

}
