package com.nopcommerce.demo.www.testsuite;

import com.nopcommerce.demo.www.pages.ApparelPage;
import com.nopcommerce.demo.www.pages.HomePage;
import com.nopcommerce.demo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApparelTabTest extends BaseTest {

    HomePage homePage = new HomePage();
    ApparelPage apparelPage = new ApparelPage();

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        homePage.clickOnApparelTab();
        String expectedMessage = "Apparel";
        String actualMessage = apparelPage.getApparelTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
}