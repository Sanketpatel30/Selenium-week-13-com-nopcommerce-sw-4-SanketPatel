package com.nopcommerce.demo.www.testsuite;

import com.nopcommerce.demo.www.pages.ElectronicsPage;
import com.nopcommerce.demo.www.pages.HomePage;
import com.nopcommerce.demo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTabTest extends BaseTest {
    HomePage homepage = new HomePage();
    ElectronicsPage electronicspage = new ElectronicsPage();

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homepage.clickOnElectronicsTab();
        String expectedMessage = "Electronics";
        String actualMessage = electronicspage.getElectronicsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }
}
