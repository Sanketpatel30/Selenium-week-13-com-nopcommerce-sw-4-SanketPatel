package com.nopcommerce.demo.www.testsuite;

import com.nopcommerce.demo.www.pages.DigitalDownloadPage;
import com.nopcommerce.demo.www.pages.HomePage;
import com.nopcommerce.demo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitalDownloadsTabTest extends BaseTest {
    HomePage homePage = new HomePage();
    DigitalDownloadPage digitalDownloadPage =  new DigitalDownloadPage();

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        homePage.clickOnDigitalDownloadsTab();
        String expectedMessage = "Digital downloads";
        String actualMessage = digitalDownloadPage.getDigitalDownloadsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
}
