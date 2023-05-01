package com.nopcommerce.demo.www.testsuite;

import com.nopcommerce.demo.www.pages.HomePage;
import com.nopcommerce.demo.www.pages.JewelryPage;
import com.nopcommerce.demo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelryTabTest extends BaseTest {

    HomePage homePage = new HomePage();
    JewelryPage jewelryPage = new JewelryPage();

    @Test
    public void userShouldNavigateToJewelrylPageSuccessfully(){
        homePage.clickOnJewelryTab();
        String expectedMessage = "Jewelry";
        String actualMessage = jewelryPage.getjewelryTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
}
