package com.nopcommerce.demo.www.testsuite;

import com.nopcommerce.demo.www.pages.BooksPage;
import com.nopcommerce.demo.www.pages.HomePage;
import com.nopcommerce.demo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTabTest extends BaseTest {
    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickBooksTab();
        String expectedMessage = "Books";
        String actualMessage = booksPage.getBooksTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
}
