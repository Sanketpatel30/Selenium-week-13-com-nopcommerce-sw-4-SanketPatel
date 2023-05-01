package com.nopcommerce.demo.www.pages;

import com.nopcommerce.demo.www.utilities.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By booksTab = By.xpath("//h1[contains(text(),'Books')]");

    public String getBooksTab(){
        return  getTextFromElement(booksTab);
    }
}