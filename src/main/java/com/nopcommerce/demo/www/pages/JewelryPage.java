package com.nopcommerce.demo.www.pages;

import com.nopcommerce.demo.www.utilities.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By jewelryTab = By.xpath("//h1[contains(text(),'Jewelry')]");

    public String getjewelryTab(){
        return  getTextFromElement(jewelryTab);
    }
}
